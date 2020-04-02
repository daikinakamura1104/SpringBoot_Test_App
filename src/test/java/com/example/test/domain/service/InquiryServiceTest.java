package com.example.test.domain.service;

import com.example.test.domain.entity.Inquiry;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public interface InquiryServiceTest {
    void save(Inquiry inquiry);
}