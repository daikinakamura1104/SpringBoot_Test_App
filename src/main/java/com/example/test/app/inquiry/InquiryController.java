package com.example.test.app.inquiry;

import com.example.test.domain.entity.Inquiry;
import com.example.test.domain.service.InquiryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/inquiry")
public class InquiryController {

    @Autowired
    private InquiryService service;
    
    @GetMapping
    public String form() {
        return "index";
    }

    @PostMapping("/confirm")
    public String confirm(@RequestParam("name")String name, @RequestParam("email")String email, @RequestParam("text")String text, Model model) {
        model.addAttribute("inquiryForm", new InquiryForm(name, email, text));
        return "confirm";
    }

    @PostMapping("/save")
    public String save(@Validated InquiryForm inquiryForm, BindingResult result) {
    if (result.hasErrors()) {
      
    }
    Inquiry inquiry = new Inquiry(inquiryForm.getName(), inquiryForm.getEmail(),inquiryForm.getText());
    service.save(inquiry);
    return "complete";
  }
}