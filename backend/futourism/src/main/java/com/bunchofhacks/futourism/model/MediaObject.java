package com.bunchofhacks.futourism.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class MediaObject {
    @JacksonXmlProperty(isAttribute = true)
    String rel;

    @JacksonXmlProperty(isAttribute = true)
    String url;

    @JacksonXmlProperty(isAttribute = true)
    String type;

    @JacksonXmlProperty(isAttribute = true)
    String source;
}
