package com.bunchofhacks.futourism.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import static com.bunchofhacks.futourism.controller.POIDataProvider.XML_NAMESPACE;

@JacksonXmlRootElement(namespace = XML_NAMESPACE)
public class Result {
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    private String status;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    private String count;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    private String overallcount;

    @JacksonXmlProperty(namespace = XML_NAMESPACE, localName = "item")
    @JacksonXmlElementWrapper(localName = "items")
    private Item[] items;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getOverallcount() {
        return overallcount;
    }

    public void setOverallcount(String overallcount) {
        this.overallcount = overallcount;
    }

    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }
}
