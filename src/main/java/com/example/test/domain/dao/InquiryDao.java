package com.example.test.domain.dao;

import com.example.test.domain.entity.Inquiry;
import org.springframework.stereotype.Component;

@Component
public interface InquiryDao {
    void create(Inquiry inquiry);
}