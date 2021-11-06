package com.bunchofhacks.futourism.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import static com.bunchofhacks.futourism.controller.POIDataProvider.XML_NAMESPACE;

@JacksonXmlRootElement(namespace = XML_NAMESPACE)
public class Result {
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    String status;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    String count;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    String overallcount;

    @JacksonXmlProperty(namespace = XML_NAMESPACE, localName = "item")
    @JacksonXmlElementWrapper(localName = "items")
    Item[] items;
}
