package com.bunchofhacks.futourism.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import static com.bunchofhacks.futourism.controller.POIDataProvider.XML_NAMESPACE;

public class Item {
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    String global_id;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    String id;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    String title;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    String type;

    @JacksonXmlProperty(namespace = XML_NAMESPACE, localName = "category")
    @JacksonXmlElementWrapper(namespace = XML_NAMESPACE, localName = "categories")
    String[] categories;

    @JacksonXmlProperty(namespace = XML_NAMESPACE, localName = "text")
    @JacksonXmlElementWrapper(namespace = XML_NAMESPACE, localName = "texts")
    String[] texts;

    @JacksonXmlProperty(namespace = XML_NAMESPACE, localName = "number")
    @JacksonXmlElementWrapper(namespace = XML_NAMESPACE, localName = "numbers")
    String[] numbers;

    @JacksonXmlProperty(namespace = XML_NAMESPACE, localName = "cuisine_type")
    @JacksonXmlElementWrapper(namespace = XML_NAMESPACE, localName = "cuisine_types")
    String[] cuisineType;


    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    String country;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    String[] areas;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    String city;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    String zip;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    String street;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    String phone;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    String web;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    String email;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    String author;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    Geo geo;

    @JacksonXmlProperty(namespace = XML_NAMESPACE, localName = "rating")
    @JacksonXmlElementWrapper(namespace = XML_NAMESPACE, localName = "ratings")
    String[] ratings;

    @JacksonXmlProperty(namespace = XML_NAMESPACE, localName = "media_object")
    @JacksonXmlElementWrapper(namespace = XML_NAMESPACE, localName = "media_objects")
    MediaObject[] mediaObjects;

    @JacksonXmlProperty(namespace = XML_NAMESPACE, localName = "timeInterval")
    @JacksonXmlElementWrapper(namespace = XML_NAMESPACE, localName = "timeIntervals")
    TimeInterval[] timeIntervals;

    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    String name;

    @JacksonXmlProperty(namespace = XML_NAMESPACE, localName = "attribute")
    @JacksonXmlElementWrapper(namespace = XML_NAMESPACE, localName = "attributes")
    Attribute[] attributes;

    @JacksonXmlProperty(namespace = XML_NAMESPACE, localName = "feature")
    @JacksonXmlElementWrapper(namespace = XML_NAMESPACE, localName = "features")
    String[] features;

    @JacksonXmlProperty(namespace = XML_NAMESPACE, localName = "season")
    @JacksonXmlElementWrapper(namespace = XML_NAMESPACE, localName = "seasons")
    String[] seasons;

    @JacksonXmlProperty(namespace = XML_NAMESPACE, localName = "address")
    @JacksonXmlElementWrapper(namespace = XML_NAMESPACE, localName = "addresses")
    Address[] addresses;

    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    String fax;

    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    String created;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    String changed;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    String source;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    String company;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    String district;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    String postoffice;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    String phone2;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    String duration;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    String length;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    String elevationMin;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    String elevationMax;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    String totalAscent;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    String totalDescent;
}
