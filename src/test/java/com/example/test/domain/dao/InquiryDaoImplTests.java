package com.example.test.domain.dao;

import com.example.test.domain.entity.Inquiry;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class InquiryDaoImplTests{
    @InjectMocks
    JdbcTemplate jdbcTemplate;
    @Mock
    Inquiry inquiry;
    @Test
    public void createTest() throws Exception{
        jdbcTemplate.update("INSERT INTO inquiry (name, email, text) VALUES (?, ?, ?)", inquiry.getName(),
                inquiry.getEmail(), inquiry.getText());
    }
}