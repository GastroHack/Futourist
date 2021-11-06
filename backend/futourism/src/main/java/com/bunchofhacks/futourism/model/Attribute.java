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

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
