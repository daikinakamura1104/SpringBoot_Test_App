package com.example.test.domain.entity;

// @Table(name="")で定義するが、省略する場合はクラス名がテーブルの名前になる
public class Inquiry {
    private String name;
    private String email;
    private String text;
   
    public Inquiry(String name, String email, String text) {
        this.setName(name);
        this.setEmail(email);
        this.setText(text);
    }

   
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getText(){
        return text;
    }

    public void setText(String text){
        this.text = text;
    }

  }