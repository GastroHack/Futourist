package com.bunchofhacks.futourism.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import static com.bunchofhacks.futourism.controller.POIDataProvider.XML_NAMESPACE;

public class Address {
    @JacksonXmlProperty(namespace = XML_NAMESPACE, isAttribute = true)
    String rel;

    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    String name;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    String fax;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    String district;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    String company;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    String firstname;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    String lastname;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    String image;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    String country;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    String city;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    String zip;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    String street;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    String phone;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    String phone2;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    String county;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    String web;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    String email;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    String salutation;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    String lastName;
}
