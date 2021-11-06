package com.bunchofhacks.futourism.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Main {
    @JacksonXmlProperty(isAttribute = true)
    private String latitude;

    @JacksonXmlProperty(isAttribute = true)
    private String longitude;

}
