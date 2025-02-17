package com.apache.camel.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AlSudaisKafkaProducerRoute extends RouteBuilder {

    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public void configure() throws Exception {
        from("timer://test-kafka?period=10000")
                .setHeader(Exchange.HTTP_METHOD, simple("GET"))
//                .to("http://localhost:8086/user/")
                .to("http://localhost:8086/user/id/64846c2109a6de337eece479")
//                .to("https://fakerapi.it/api/v1/images?_width=380")
                .process(exchange -> {
                    String data = exchange.getIn().getBody(String.class);
//                    JsonNode jsonNode = this.objectMapper.readTree(data);
                    System.out.println("Producer Data :: " + data);
                })
//                .setBody(simple("First Message From Kafka"))
                .to("kafka:myKafkaTopicNew");

    }
}
