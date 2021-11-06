package com.bunchofhacks.futourism.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import static com.bunchofhacks.futourism.controller.POIDataProvider.XML_NAMESPACE;

public class Item {
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    private String global_id;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    private String id;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    private String title;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    private String type;

    @JacksonXmlProperty(namespace = XML_NAMESPACE, localName = "category")
    @JacksonXmlElementWrapper(namespace = XML_NAMESPACE, localName = "categories")
    private String[] categories;

    @JacksonXmlProperty(namespace = XML_NAMESPACE, localName = "text")
    @JacksonXmlElementWrapper(namespace = XML_NAMESPACE, localName = "texts")
    private String[] texts;

    @JacksonXmlProperty(namespace = XML_NAMESPACE, localName = "number")
    @JacksonXmlElementWrapper(namespace = XML_NAMESPACE, localName = "numbers")
    private String[] numbers;

    @JacksonXmlProperty(namespace = XML_NAMESPACE, localName = "cuisine_type")
    @JacksonXmlElementWrapper(namespace = XML_NAMESPACE, localName = "cuisine_types")
    private String[] cuisineType;


    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    private String country;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    private String[] areas;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    private String city;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    private String zip;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    private String street;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    private String phone;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    private String web;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    private String email;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    private String author;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    private Geo geo;

    @JacksonXmlProperty(namespace = XML_NAMESPACE, localName = "rating")
    @JacksonXmlElementWrapper(namespace = XML_NAMESPACE, localName = "ratings")
    private String[] ratings;

    @JacksonXmlProperty(namespace = XML_NAMESPACE, localName = "media_object")
    @JacksonXmlElementWrapper(namespace = XML_NAMESPACE, localName = "media_objects")
    private MediaObject[] mediaObjects;

    @JacksonXmlProperty(namespace = XML_NAMESPACE, localName = "timeInterval")
    @JacksonXmlElementWrapper(namespace = XML_NAMESPACE, localName = "timeIntervals")
    private TimeInterval[] timeIntervals;

    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    private String name;

    @JacksonXmlProperty(namespace = XML_NAMESPACE, localName = "attribute")
    @JacksonXmlElementWrapper(namespace = XML_NAMESPACE, localName = "attributes")
    private Attribute[] attributes;

    @JacksonXmlProperty(namespace = XML_NAMESPACE, localName = "feature")
    @JacksonXmlElementWrapper(namespace = XML_NAMESPACE, localName = "features")
    private String[] features;

    @JacksonXmlProperty(namespace = XML_NAMESPACE, localName = "season")
    @JacksonXmlElementWrapper(namespace = XML_NAMESPACE, localName = "seasons")
    private String[] seasons;

    @JacksonXmlProperty(namespace = XML_NAMESPACE, localName = "address")
    @JacksonXmlElementWrapper(namespace = XML_NAMESPACE, localName = "addresses")
    private Address[] addresses;

    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    private String fax;

    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    private String created;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    private String changed;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    private String source;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    private String company;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    private String district;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    private String postoffice;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    private String phone2;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    private String duration;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    private String length;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    private String elevationMin;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    private String elevationMax;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    private String totalAscent;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    private String totalDescent;

    public String getGlobal_id() {
        return global_id;
    }

    public void setGlobal_id(String global_id) {
        this.global_id = global_id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String[] getCategories() {
        return categories;
    }

    public void setCategories(String[] categories) {
        this.categories = categories;
    }

    public String[] getTexts() {
        return texts;
    }

    public void setTexts(String[] texts) {
        this.texts = texts;
    }

    public String[] getNumbers() {
        return numbers;
    }

    public void setNumbers(String[] numbers) {
        this.numbers = numbers;
    }

    public String[] getCuisineType() {
        return cuisineType;
    }

    public void setCuisineType(String[] cuisineType) {
        this.cuisineType = cuisineType;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String[] getAreas() {
        return areas;
    }

    public void setAreas(String[] areas) {
        this.areas = areas;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    public String[] getRatings() {
        return ratings;
    }

    public void setRatings(String[] ratings) {
        this.ratings = ratings;
    }

    public MediaObject[] getMediaObjects() {
        return mediaObjects;
    }

    public void setMediaObjects(MediaObject[] mediaObjects) {
        this.mediaObjects = mediaObjects;
    }

    public TimeInterval[] getTimeIntervals() {
        return timeIntervals;
    }

    public void setTimeIntervals(TimeInterval[] timeIntervals) {
        this.timeIntervals = timeIntervals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Attribute[] getAttributes() {
        return attributes;
    }

    public void setAttributes(Attribute[] attributes) {
        this.attributes = attributes;
    }

    public String[] getFeatures() {
        return features;
    }

    public void setFeatures(String[] features) {
        this.features = features;
    }

    public String[] getSeasons() {
        return seasons;
    }

    public void setSeasons(String[] seasons) {
        this.seasons = seasons;
    }

    public Address[] getAddresses() {
        return addresses;
    }

    public void setAddresses(Address[] addresses) {
        this.addresses = addresses;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getChanged() {
        return changed;
    }

    public void setChanged(String changed) {
        this.changed = changed;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getPostoffice() {
        return postoffice;
    }

    public void setPostoffice(String postoffice) {
        this.postoffice = postoffice;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getElevationMin() {
        return elevationMin;
    }

    public void setElevationMin(String elevationMin) {
        this.elevationMin = elevationMin;
    }

    public String getElevationMax() {
        return elevationMax;
    }

    public void setElevationMax(String elevationMax) {
        this.elevationMax = elevationMax;
    }

    public String getTotalAscent() {
        return totalAscent;
    }

    public void setTotalAscent(String totalAscent) {
        this.totalAscent = totalAscent;
    }

    public String getTotalDescent() {
        return totalDescent;
    }

    public void setTotalDescent(String totalDescent) {
        this.totalDescent = totalDescent;
    }
}
