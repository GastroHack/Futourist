package com.bunchofhacks.futourism.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

import static com.bunchofhacks.futourism.controller.POIDataProvider.XML_NAMESPACE;

public class Attribute {
    @JacksonXmlProperty(namespace = XML_NAMESPACE, isAttribute = true)
    String key;

    @JacksonXmlText
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    String content;
}
