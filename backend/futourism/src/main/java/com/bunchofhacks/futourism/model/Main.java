package com.bunchofhacks.futourism.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import static com.bunchofhacks.futourism.controller.POIDataProvider.XML_NAMESPACE;

public class Main {
    @JacksonXmlProperty(namespace = XML_NAMESPACE, isAttribute = true)
    private String latitude;

    @JacksonXmlProperty(namespace = XML_NAMESPACE, isAttribute = true)
    private String longitude;

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
}
