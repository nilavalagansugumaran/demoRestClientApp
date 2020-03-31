package com.example.demoRestClientApp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;

@Component
@Slf4j
public class MyClientComponent {

    private RestTemplate restTemplate;

    // feign
    // hystrix


    @Value("${service.url}")
    private String serviceBaseUrl;

    public void callService(){
        ResponseEntity<String> response = restTemplate.getForEntity(serviceBaseUrl + 101, String.class);
        log.debug("Response from server, code = {}, body = {} ", response.getStatusCode(), response.getBody());
    }

    @PostConstruct
    public void setup(){
        restTemplate = new RestTemplate();
    }
}
