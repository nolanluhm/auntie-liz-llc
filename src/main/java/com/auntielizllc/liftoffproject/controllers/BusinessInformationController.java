package com.auntielizllc.liftoffproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BusinessInformationController {

    @GetMapping
    public String displayHomePage() {
        return "index";
    }

    @GetMapping("contact-information")
    public String displayContactInformationPage () {
        return "contact_information";
    }

    @GetMapping("services-and-pricing")
    public String displayServicesAndPricingPage () {
        return "services_and_pricing";
    }

    @GetMapping("about")
    public String displayAboutPage () {
        return "about";
    }

    @GetMapping("faq")
    public String displayFaqPage () {
        return "faq";
    }
}
