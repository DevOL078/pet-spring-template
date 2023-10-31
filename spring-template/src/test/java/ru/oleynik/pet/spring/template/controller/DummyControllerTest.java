package ru.oleynik.pet.spring.template.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = DummyController.class)
public class DummyControllerTest {

    @Autowired
    MockMvc mvc;

    @Test
    public void success() throws Exception {
        mvc.perform(get("/dummy"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("DUMMY")));
    }

}
