package com.bunchofhacks.futourism.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

public class Attribute {
    @JacksonXmlProperty(isAttribute = true)
    String key;

    @JacksonXmlText
    String content;
}
