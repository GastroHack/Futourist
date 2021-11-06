package com.bunchofhacks.futourism.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import static com.bunchofhacks.futourism.controller.POIDataProvider.XML_NAMESPACE;

public class Main {
    @JacksonXmlProperty(namespace = XML_NAMESPACE, isAttribute = true)
    private String latitude;

    @JacksonXmlProperty(namespace = XML_NAMESPACE, isAttribute = true)
    private String longitude;

}
