package com.bunchofhacks.futourism.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class TimeInterval {
    @JacksonXmlProperty(isAttribute = true)
    String start;

    @JacksonXmlProperty(isAttribute = true)
    String end;

    @JacksonXmlProperty(isAttribute = true)
    String repeatUntil;

    @JacksonXmlProperty(isAttribute = true)
    String tz;

    @JacksonXmlProperty(isAttribute = true)
    String freq;

    @JacksonXmlProperty(isAttribute = true)
    String interval;
    String[] weekdays;
}
