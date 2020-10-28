package com.auntielizllc.liftoffproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BusinessInformationController {

    @GetMapping
    public String displayHomePage(Model model) {
        model.addAttribute("title", "Home — Auntie Liz, LLC");
        return "index";
    }

    @GetMapping("schedule-appointment")
    public String displayScheduleAppointmentPage(Model model) {
        model.addAttribute("title", "Schedule Appointment — Auntie Liz, LLC");
        return "schedule_appointment";
    }

    @GetMapping("contact-information")
    public String displayContactInformationPage(Model model) {
        model.addAttribute("title", "Contact Information — Auntie Liz, LLC");
        return "contact_information";
    }

    @GetMapping("services-and-pricing")
    public String displayServicesAndPricingPage(Model model) {
        model.addAttribute("title", "Services and Pricing — Auntie Liz, LLC");
        return "services_and_pricing";
    }

    @GetMapping("products-and-pricing")
    public String displayProductsAndPricingPage(Model model) {
        model.addAttribute("title", "Products and Pricing — Auntie Liz, LLC");
        return "products_and_pricing";
    }

    @GetMapping("testimonials")
    public String displayTestimonialsPage(Model model) {
        model.addAttribute("title", "Testimonials — Auntie Liz, LLC");
        return "testimonials";
    }

    @GetMapping("faq")
    public String displayFaqPage(Model model) {
        model.addAttribute("title", "FAQ — Auntie Liz, LLC");
        return "faq";
    }
}
