package com.apache.camel.config;

import com.apache.camel.enitities.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.invoke.MethodHandles;

@Component
public class AlSudaisKafkaConsumerRoute extends RouteBuilder {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public void configure() throws Exception {
//        getContext().setTracing(true);

        from("kafka:myKafkaTopicNew")
                .process(exchange -> exchange.getIn().getBody(String.class))
                .unmarshal()
                .json(JsonLibrary.Jackson, User.class)
                .log("${body.toString()}");
//                .log("User :: ${body.userId}, ${body.name}, ${body.ability}");
    }
}