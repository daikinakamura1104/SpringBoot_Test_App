package com.example.test.domain.service;

import com.example.test.domain.dao.InquiryDao;
import com.example.test.domain.entity.Inquiry;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class InquiryServiceImplTest implements InquiryServiceTest {

    @Autowired
    InquiryDao dao;

    @Override
    @Test
    public void save(Inquiry inquiry) {
        dao.create(inquiry);
    }


}