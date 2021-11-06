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

    public String getRel() {
        return rel;
    }

    public void setRel(String rel) {
        this.rel = rel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

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
