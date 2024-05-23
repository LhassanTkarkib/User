package com.migrationdemo.user.Consumer;

import com.migrationdemo.feignclient.AccountEntityDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class UserConsumer {

@KafkaListener(topics = "Userchanger", groupId = "Communication", containerFactory = "kafkaListenerContainerFactory")

    public void consume(AccountEntityDto account) {


    }

}
