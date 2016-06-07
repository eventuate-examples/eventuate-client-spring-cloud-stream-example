package io.eventuate.spring.cloud.stream.binder.eventuate.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableBinding(Sink.class)
public class EventuateStreamDemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(EventuateStreamDemoApplication.class, args);
  }

  @Bean
  public ExampleMessageConsumer exampleMessageConsumer() {
    return new ExampleMessageConsumer();
  }

}
