package com.auntielizllc.liftoffproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ServicesAndPricingController {

    @GetMapping("services-and-pricing")
    public String displayServicesAndPricing () {
        return "services_and_pricing";
    }
}
