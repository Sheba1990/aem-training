package com.epam.training.coreconsumer;

import com.epam.training.core.stringgen.StringGenerator;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(service = StringGeneratorVersion1Consumer.class)
public class StringGeneratorVersion1Consumer {

    @Reference
    StringGenerator stringGenerator;

    public String invokeGenerator() {
        return stringGenerator.generateString();
    }
}
