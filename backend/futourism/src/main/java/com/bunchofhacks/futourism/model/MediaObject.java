package com.bunchofhacks.futourism.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

import static com.bunchofhacks.futourism.controller.POIDataProvider.XML_NAMESPACE;

public class MediaObject {
    @JacksonXmlProperty(namespace = XML_NAMESPACE, isAttribute = true)
    String rel;

    @JacksonXmlProperty(namespace = XML_NAMESPACE, isAttribute = true)
    String url;

    @JacksonXmlProperty(namespace = XML_NAMESPACE, isAttribute = true)
    String type;

    @JacksonXmlProperty(namespace = XML_NAMESPACE, isAttribute = true)
    String source;

    @JacksonXmlProperty(namespace = XML_NAMESPACE, isAttribute = true)
    String license;

    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    String author;

    @JacksonXmlText
    String text;
}
