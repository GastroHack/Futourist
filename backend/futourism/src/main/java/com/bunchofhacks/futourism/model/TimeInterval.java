package com.bunchofhacks.futourism.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import static com.bunchofhacks.futourism.controller.POIDataProvider.XML_NAMESPACE;

public class TimeInterval {
    @JacksonXmlProperty(namespace = XML_NAMESPACE, isAttribute = true)
    String start;

    @JacksonXmlProperty(namespace = XML_NAMESPACE, isAttribute = true)
    String end;

    @JacksonXmlProperty(namespace = XML_NAMESPACE, isAttribute = true)
    String repeatUntil;

    @JacksonXmlProperty(namespace = XML_NAMESPACE, isAttribute = true)
    String tz;

    @JacksonXmlProperty(namespace = XML_NAMESPACE, isAttribute = true)
    String freq;

    @JacksonXmlProperty(namespace = XML_NAMESPACE, isAttribute = true)
    String interval;
    @JacksonXmlProperty(namespace = XML_NAMESPACE)
    String[] weekdays;

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getRepeatUntil() {
        return repeatUntil;
    }

    public void setRepeatUntil(String repeatUntil) {
        this.repeatUntil = repeatUntil;
    }

    public String getTz() {
        return tz;
    }

    public void setTz(String tz) {
        this.tz = tz;
    }

    public String getFreq() {
        return freq;
    }

    public void setFreq(String freq) {
        this.freq = freq;
    }

    public String getInterval() {
        return interval;
    }

    public void setInterval(String interval) {
        this.interval = interval;
    }

    public String[] getWeekdays() {
        return weekdays;
    }

    public void setWeekdays(String[] weekdays) {
        this.weekdays = weekdays;
    }
}
