package com.apache.Kafka;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    private static final Logger LOGGER=LoggerFactory.getLogger("KafkaProducer");
   
    private KafkaTemplate<String,String > kafkaTemplate;

    public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message){
        LOGGER.info("lOG MESSAGE",message);
        kafkaTemplate.send("kafkatopicwork",message);

    }

    

}
