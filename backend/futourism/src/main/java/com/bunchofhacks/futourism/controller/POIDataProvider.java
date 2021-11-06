package com.bunchofhacks.futourism.controller;

import com.bunchofhacks.futourism.model.Result;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlFactory;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.util.StaxUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

@Component
public class POIDataProvider {

  public static final String XML_NAMESPACE = "http://meta.et4.de/ET2014A";

  private Result EventDe;
  private Result EventEn;
  private Result GastroDe;
  private Result GastroEn;
  private Result HotelDe;
  private Result HotelEn;
  private Result POIDe;
  private Result POIEn;
  private Result TourDe;
  private Result TourEn;

  public POIDataProvider() {
    parseData();
  }

  public void parseData() {

    XmlMapper xmlMapper = new XmlMapper(new NamespaceXmlFactory("http://meta.et4.de/ET2014A"));
    xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);

    try {
      EventEn =
          xmlMapper.readValue(
              getBufferForFilename("backend/futourism/data/Event_en.xml"), Result.class);
      GastroEn =
          xmlMapper.readValue(
              getBufferForFilename("backend/futourism/data/Gastro_en.xml"), Result.class);
      HotelEn =
          xmlMapper.readValue(
              getBufferForFilename("backend/futourism/data/Hotel_en.xml"), Result.class);
      POIEn =
          xmlMapper.readValue(
              getBufferForFilename("backend/futourism/data/POI_en.xml"), Result.class);
      TourEn =
          xmlMapper.readValue(
              getBufferForFilename("backend/futourism/data/Tour_en.xml"), Result.class);

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private byte[] getBufferForFilename(String filename) throws IOException {
    Path path = Paths.get(filename);
    return java.nio.file.Files.readAllBytes(path);
  }

  @Bean
  @Scope("singleton")
  public Result getEventDe() {
    return EventDe;
  }

  @Bean
  @Scope("singleton")
  public Result getEventEn() {
    return EventEn;
  }

  @Bean
  @Scope("singleton")
  public Result getGastroDe() {
    return GastroDe;
  }

  @Bean
  @Scope("singleton")
  public Result getGastroEn() {
    return GastroEn;
  }

  @Bean
  @Scope("singleton")
  public Result getHotelDe() {
    return HotelDe;
  }

  @Bean
  @Scope("singleton")
  public Result getHotelEn() {
    return HotelEn;
  }

  @Bean
  @Scope("singleton")
  public Result getPOIDe() {
    return POIDe;
  }

  @Bean
  @Scope("singleton")
  public Result getPOIEn() {
    return POIEn;
  }

  @Bean
  @Scope("singleton")
  public Result getTourDe() {
    return TourDe;
  }

  @Bean
  @Scope("singleton")
  public Result getTourEn() {
    return TourEn;
  }

  class NamespaceXmlFactory extends XmlFactory {

    private final String defaultNamespace;

    public NamespaceXmlFactory(String defaultNamespace) {
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
