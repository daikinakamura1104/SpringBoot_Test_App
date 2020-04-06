package com.example.test.domain.dao;

import com.example.test.domain.entity.Inquiry;
import org.springframework.stereotype.Component;

// データベース内のデータを操作するためのインターファイス(メソッド)を提供する。
@Component
public interface InquiryDao {
    void create(Inquiry inquiry);
}