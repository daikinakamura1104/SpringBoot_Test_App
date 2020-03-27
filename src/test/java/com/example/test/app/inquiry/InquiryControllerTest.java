package com.example.test.app.inquiry;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringJUnit4ClassRunner.class)
// @WebMvcTest
@SpringBootTest
public class InquiryControllerTest{
    
    private MockMvc mockMvc;

    @Autowired
    InquiryController target;

    @Before
    public void setup(){
        mockMvc = MockMvcBuilders.standaloneSetup(target).build();
    }

    @Test
    public void getIndexTest() throws Exception{
        // performでGETリクエストを送信している
        mockMvc.perform(get("/inquiry"))
            .andExpect(status().isOk())
            .andExpect(view().name("index"));
    }

    @Test
    public void postIndexTest() throws Exception{
        mockMvc.perform(post("/inquiry"))
            .andExpect(status().isMethodNotAllowed());
    }

    @Test
    public void postConfirmTest() throws Exception{
        mockMvc.perform(post("/inquiry/confirm"))
            .andExpect(status().isOk())
            .andExpect(view().name("confirm"));
    }

    


}

