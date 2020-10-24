package com.epam.training.coreconsumer2;

import com.epam.training.core.stringgen.StringGenerator;

public class StringGeneratorVersion2Consumer {
    public String invokeGenerator() {
        return new StringGenerator().generateString();
    }
}
