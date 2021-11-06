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

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public String getGeometry() {
        return geometry;
    }

    public void setGeometry(String geometry) {
        this.geometry = geometry;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
