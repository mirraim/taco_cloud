package ru.mirraim.tacos.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest
class HomeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    /**
     * Starts with the MockMvc object to perform an HTTP GET request for / (the root path)
     * The response should have an HTTP 200 (OK) status.
     * The view should have a logical name of home.
     * The rendered view should contain the text “Welcome to….”
     * If, after the MockMvc object performs the request, any of those expectations aren’t met,
     * then the test fails
     */
    @Test
    public void testHomePage() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("home"))
                .andExpect(content().string(
                        containsString("Welcome to...")));
    }

}