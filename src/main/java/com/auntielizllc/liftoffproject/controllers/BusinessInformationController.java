package com.auntielizllc.liftoffproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BusinessInformationController {

    @GetMapping
    public String displayHomePage(Model model) {
        return "index";
    }

    @GetMapping("schedule-appointment")
    public String displayScheduleAppointmentPage() {
        return "schedule_appointment";
    }

    @GetMapping("contact-information")
    public String displayContactInformationPage() {
        return "contact_information";
    }

    @GetMapping("services-and-pricing")
    public String displayServicesAndPricingPage() {
        return "services_and_pricing";
    }

    @GetMapping("testimonials")
    public String displayTestimonialsPage() {
        return "testimonials";
    }

    @GetMapping("faq")
    public String displayFaqPage() {
        return "faq";
    }

    @GetMapping("schedule-appointment/new-client-form")
    public String displayNewClientFormPage() {
        return "new_client_form";
    }
}
