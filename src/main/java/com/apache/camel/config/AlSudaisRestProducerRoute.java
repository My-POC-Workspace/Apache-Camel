//package com.apache.camel.config;
//
//import org.apache.camel.builder.RouteBuilder;
//import org.springframework.stereotype.Component;
//
//@Component
//public class AlSudaisRestProducerRoute extends RouteBuilder {
//
//    @Override
//    public void configure() throws Exception {
//        from("direct:select")
//                .setBody(simple("First Message From Kafka"))
//                .log("Message Producing");
//    }
//}
