package com.epam.training.core.servlets;

import com.epam.training.core.stringgen.StringGenerator;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletPaths;
import org.apache.sling.servlets.annotations.SlingServletResourceTypes;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Component(service = Servlet.class)
@SlingServletPaths({"/services/hello", "/services/welcome"})
@SlingServletResourceTypes(
        resourceTypes = "sling/servlet/default",
        selectors = {"hello"},
        extensions = "csv")
public class HelloServlet extends SlingSafeMethodsServlet {

    @Reference
    StringGenerator stringGenerator;

    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response) throws ServletException, IOException {
        response.setStatus(HttpServletResponse.SC_OK);
        response.setContentType("text/html");
        try (PrintWriter writer = response.getWriter()) {
            writer.write("<p>" + stringGenerator.generateString() + "</p>");
        }
    }
}
