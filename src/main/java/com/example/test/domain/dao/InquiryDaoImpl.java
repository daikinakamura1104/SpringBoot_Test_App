// package com.example.test.domain.dao;

// import com.example.test.domain.entity.Inquiry;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.jdbc.core.JdbcTemplate;
// import org.springframework.stereotype.Repository;

// @Repository
// public class InquiryDaoImpl implements InquiryDao {

//     private JdbcTemplate jdbcTemplate;

//     @Autowired
//     public InquiryDaoImpl(JdbcTemplate jdbcTemplate) {
//         this.jdbcTemplate = jdbcTemplate;
//     }

//     @Override
//     public void create(Inquiry inquiry) {
//         jdbcTemplate.update("INSERT INTO inquiry (name, email, text) VALUES (?, ?, ?)", inquiry.getName(),
//                 inquiry.getEmail(), inquiry.getText());
//     }
// }