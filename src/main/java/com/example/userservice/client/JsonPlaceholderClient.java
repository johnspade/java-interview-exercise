package com.example.userservice.client;

import com.example.userservice.dto.Post;
import com.example.userservice.dto.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class JsonPlaceholderClient {

    private final RestTemplate restTemplate;
    private final String baseUrl;

    public JsonPlaceholderClient(
            RestTemplate restTemplate,
            @Value("${jsonplaceholder.base-url:https://jsonplaceholder.typicode.com}") String baseUrl
    ) {
        this.restTemplate = restTemplate;
        this.baseUrl = baseUrl;
    }

    public User getUser(Long userId) {
        return restTemplate.getForObject(
            baseUrl + "/users/{id}",
            User.class,
            userId
        );
    }

    public List<Post> getPostsByUser(Long userId) {
        return restTemplate.exchange(
            baseUrl + "/posts?userId={userId}",
            HttpMethod.GET,
            null,
            new ParameterizedTypeReference<List<Post>>() {},
            userId
        ).getBody();
    }
}
