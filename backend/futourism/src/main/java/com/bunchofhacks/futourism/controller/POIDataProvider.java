package com.bunchofhacks.futourism.controller;

import com.bunchofhacks.futourism.model.Item;
import com.bunchofhacks.futourism.model.Result;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlFactory;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.util.StaxUtil;
import org.springframework.stereotype.Component;

import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component
public class POIDataProvider {

  public static final String XML_NAMESPACE = "http://meta.et4.de/ET2014A";

  private Result EventEn;
  private Result GastroEn;
  private Result HotelEn;
  private Result POIEn;
  private Result TourEn;

  public POIDataProvider() {
    parseData();
  }

  public void parseData() {

    XmlMapper xmlMapper = new XmlMapper(new NamespaceXmlFactory("http://meta.et4.de/ET2014A"));
    xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);

    try {
      EventEn = xmlMapper.readValue(getBufferForFilename("data/Event_en.xml"), Result.class);
      GastroEn = xmlMapper.readValue(getBufferForFilename("data/Gastro_en.xml"), Result.class);
      HotelEn = xmlMapper.readValue(getBufferForFilename("data/Hotel_en.xml"), Result.class);
      POIEn = xmlMapper.readValue(getBufferForFilename("data/POI_en.xml"), Result.class);
      TourEn = xmlMapper.readValue(getBufferForFilename("data/Tour_en.xml"), Result.class);

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private byte[] getBufferForFilename(String filename) throws IOException {
    Path path = Paths.get(filename);
    return java.nio.file.Files.readAllBytes(path);
  }

  public Result getEventEn() {
    return EventEn;
  }

  public Result getGastroEn() {
    return GastroEn;
  }

  public Result getHotelEn() {
    return HotelEn;
  }

  public Result getPOIEn() {
    return POIEn;
  }

  public Result getTourEn() {
    return TourEn;
  }

  public List<List<Item>> getItemsbyIds(String... ids) {
    List<List<Item>> result = new ArrayList<>();

    for (String id : ids) {
      List<Item> items = EventEn.getItemById(id);

      if (!items.isEmpty()) {
        result.add(items);
        continue;
      }

      items = GastroEn.getItemById(id);

      if (!items.isEmpty()) {
        result.add(items);
        continue;
      }

      items = HotelEn.getItemById(id);

      if (!items.isEmpty()) {
        result.add(items);
        continue;
      }

      items = POIEn.getItemById(id);

      if (!items.isEmpty()) {
        result.add(items);
        continue;
      }

      items = TourEn.getItemById(id);

      if (!items.isEmpty()) {
        result.add(items);
      }
    }

    return result;
  }

  class NamespaceXmlFactory extends XmlFactory {

    private final String defaultNamespace;

    NamespaceXmlFactory(String defaultNamespace) {
      this.defaultNamespace = Objects.requireNonNull(defaultNamespace);
    }

    @Override
    protected XMLStreamWriter _createXmlWriter(IOContext ctxt, Writer w) throws IOException {
      XMLStreamWriter writer = super._createXmlWriter(ctxt, w);
      try {
        writer.setDefaultNamespace(defaultNamespace);
      } catch (XMLStreamException e) {
        StaxUtil.throwAsGenerationException(e, null);
      }
      return writer;
    }
  }
}
