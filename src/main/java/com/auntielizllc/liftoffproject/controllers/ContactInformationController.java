package com.auntielizllc.liftoffproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactInformationController {

    @GetMapping("contact-information")
    public String displayContactInformation (Model model) {
        return "contact_information";
    }
}
