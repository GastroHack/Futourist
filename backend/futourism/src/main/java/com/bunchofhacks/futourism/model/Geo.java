package com.bunchofhacks.futourism.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import static com.bunchofhacks.futourism.controller.POIDataProvider.XML_NAMESPACE;

public class Geo {
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    Main main;

    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    String geometry;

    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    String author;
}
