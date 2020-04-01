package com.example.test.domain.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.example.test.domain.entity.Inquiry;
import com.example.test.domain.service.InquiryServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class InquiryDaoImplTests {

    @Autowired
    private InquiryServiceImpl inquiryserviceimpl;

    @Test
    public final void entityTest(){
        Inquiry inquiry1 = new Inquiry("daikinakamura","daaaa@gmail.com","〇〇のここがダメでした。");
        inquiryserviceimpl.save(inquiry1);
        Inquiry inquiry2 = new Inquiry("shotatashiro", "shoooo@gmail.com", "〇〇のここはどういう意味ですか？");
        inquiryserviceimpl.save(inquiry2);
        String name1 = inquiry1.getName();
        assertEquals("daikinakamura", name1);
        String name2 = inquiry2.getName();
        assertEquals("shotatashiro", name2);
    }
}