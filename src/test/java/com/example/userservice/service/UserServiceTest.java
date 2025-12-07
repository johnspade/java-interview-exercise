package com.example.userservice.service;

import com.example.userservice.client.JsonPlaceholderClient;
import com.example.userservice.dto.Post;
import com.example.userservice.dto.User;
import com.example.userservice.dto.UserSummary;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @Mock
    private JsonPlaceholderClient client;

    @InjectMocks
    private UserService userService;

    @Test
    void getUser_shouldReturnUser() {
        // Given
        User expectedUser = new User(1L, "John Doe", "johndoe", "john@example.com");
        when(client.getUser(1L)).thenReturn(expectedUser);

        // When
        User result = userService.getUser(1L);

        // Then
        assertThat(result).isEqualTo(expectedUser);
        assertThat(result.name()).isEqualTo("John Doe");
    }

    /**
     * TODO: Implement this test
     * 
     * Test that getUserSummary correctly combines user and posts data.
     * 
     * Hints:
     * - Mock both client.getUser() and client.getPostsByUser()
     * - Verify the returned UserSummary has the correct values
     */
    @Test
    void getUserSummary_shouldCombineUserAndPosts() {
        // TODO: Implement this test
        
        // Given - set up your mocks
        
        // When - call the service method
        
        // Then - verify the result
    }
}
