package com.example.test.domain.service;

import com.example.test.domain.dao.InquiryDao;
import com.example.test.domain.entity.Inquiry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InquiryServiceImpl implements InquiryService {
  
  private InquiryDao dao;
  
  @Autowired
  public InquiryServiceImpl(InquiryDao dao) {
    this.dao = dao;
  }
  @Override
  public void save(Inquiry inquiry) {
    dao.create(inquiry);
  }
}