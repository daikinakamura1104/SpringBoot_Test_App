
package com.example.test.app.inquiry;

import com.example.test.DemoApplication;
import com.example.test.app.inquiry.InquiryController;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@AutoConfigureMockMvc
@SpringBootTest(classes = DemoApplication.class)
public class InquiryControllerTest{
    
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    InquiryController target;

    @Before
    public void setup(){
        mockMvc = MockMvcBuilders.standaloneSetup(target).build();
    }

    @Test
    public void getIndexTest() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.get("/inquiry"))
                .andExpect(status().isOk())
                .andExpect(view().name("index"));
    }
}



