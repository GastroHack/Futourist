package com.bunchofhacks.futourism.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import static com.bunchofhacks.futourism.controller.POIDataProvider.XML_NAMESPACE;

public class TimeInterval {
    @JacksonXmlProperty(namespace = XML_NAMESPACE, isAttribute = true)
    String start;

    @JacksonXmlProperty(namespace = XML_NAMESPACE, isAttribute = true)
    String end;

    @JacksonXmlProperty(namespace = XML_NAMESPACE, isAttribute = true)
    String repeatUntil;

    @JacksonXmlProperty(namespace = XML_NAMESPACE, isAttribute = true)
    String tz;

    @JacksonXmlProperty(namespace = XML_NAMESPACE, isAttribute = true)
    String freq;

    @JacksonXmlProperty(namespace = XML_NAMESPACE, isAttribute = true)
    String interval;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    String[] weekdays;
}
