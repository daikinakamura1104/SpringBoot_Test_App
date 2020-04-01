package com.example.test.app.inquiry;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class InquiryControllerTest{
    
    private MockMvc mockMvc;

    @Autowired
    InquiryController target;

    @Before
    public void setup(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        this.mockMvc = MockMvcBuilders.standaloneSetup(target).setViewResolvers(viewResolver).build();
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
        mockMvc.perform(post("/inquiry/confirm/")
                .param("name", "NakamuraDaiki")
                .param("email", "daaaa@gmail.com")
                .param("text", "〇〇は異常がありました。"))
            .andExpect(status().isOk())
            .andExpect(view().name("confirm"));
    }

    @Test
    public void getConfirmTest() throws Exception{
        mockMvc.perform(get("/inquiry/confirm"))
            .andExpect(status().isMethodNotAllowed());
    }

    @Test
    public void postSaveTest() throws Exception{
        mockMvc.perform(post("/inquiry/save"))
            .andExpect(status().isOk())
            .andExpect(view().name("complete"));
    }

    @Test
    public void getSaveTest() throws Exception{
        mockMvc.perform(get("/inquiry/save"))
            .andExpect(status().isMethodNotAllowed());
    }
    
    @Test
    public void getListTest() throws Exception{
        mockMvc.perform(get("/inquiry/list/")
                    .param("name", "NakamuraDaiki")
                    .param("email", "daaaa@gmail.com")
                    .param("text", "〇〇は異常がありました。"))
                    .andExpect(status().isOk())
                    .andExpect(view().name("list"));            
    }

    @Test
    public void postListTest() throws Exception{
        mockMvc.perform(post("/inquiry/list/")
                .param("name", "NakamuraDaiki")
                .param("email", "daaaa@gmail.com")
                .param("text", "〇〇は異常がありました。"))
            .andExpect(status().isMethodNotAllowed());
    }



}

