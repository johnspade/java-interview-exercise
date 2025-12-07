package com.example.userservice.service;

import com.example.userservice.client.JsonPlaceholderClient;
import com.example.userservice.dto.User;
import com.example.userservice.dto.UserSummary;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final JsonPlaceholderClient client;

    public UserService(JsonPlaceholderClient client) {
        this.client = client;
    }

    public User getUser(Long userId) {
        return client.getUser(userId);
    }

    /**
     * TODO: Implement this method
     * 
     * Fetch the user and their posts from the upstream API,
     * then combine them into a UserSummary response.
     * 
     * UserSummary should contain:
     * - id: the user's id
     * - name: the user's name
     * - email: the user's email
     * - postCount: number of posts by this user
     * - postTitles: list of post titles
     */
    public UserSummary getUserSummary(Long userId) {
        // TODO: Implement this method
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
