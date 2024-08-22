package rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.fasterxml.jackson.databind.ObjectMapper;

import persistence.Storage;

/**
 * The Spring application.
 */
@SpringBootApplication
public class CoutureRentalApplication {

  /**
   * Create the object mapper. This is used to convert objects to JSON.
   * @return The object mapper.
   */
  @Bean
  public ObjectMapper objectMapperModule() {
    return Storage.createObjectMapper();
  }

  /**
   * The main method.
   * @param args
   */
  public static void main(String[] args) {
    SpringApplication.run(CoutureRentalApplication.class, args);
  }
}