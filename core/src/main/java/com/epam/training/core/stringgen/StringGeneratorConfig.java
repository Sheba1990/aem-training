package com.epam.training.core.stringgen;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition
public @interface StringGeneratorConfig {

    @AttributeDefinition(
            name = "Parts",
            description = "Elements the string is generated from",
            type = AttributeType.STRING)
    String[] parts() default {"Lorem", "ipsum", "dolor", "consectetur", "adipiscing"}; //Returns an array type

    @AttributeDefinition(
            name = "Length",
            type = AttributeType.INTEGER)
    int length() default 15; //Returns an integer value

    @AttributeDefinition(
            name = "Truncated to Fit",
            type = AttributeType.BOOLEAN)
    boolean truncateToFit() default false; //Returns boolean value
}
