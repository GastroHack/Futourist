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

    public String getRel() {
        return rel;
    }

    public void setRel(String rel) {
        this.rel = rel;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
