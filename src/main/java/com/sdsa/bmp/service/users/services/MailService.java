package com.sdsa.bmp.service.users.services;

import com.sdsa.bmp.service.users.dto.UserDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.sleuth.annotation.NewSpan;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
@Slf4j
public class MailService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    @NewSpan("send-email")
    public void sendUserWelcomeMail(UserDto userDto) {
        log.info("Sending a creation email for {}", userDto.getLogin());
        kafkaTemplate.send("mails", "user.creation: " + userDto.getLogin());
    }
}
