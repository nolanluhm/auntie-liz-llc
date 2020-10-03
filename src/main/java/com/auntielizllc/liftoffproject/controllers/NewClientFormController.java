package com.auntielizllc.liftoffproject.controllers;

import com.auntielizllc.liftoffproject.data.CustomerRepository;
import com.auntielizllc.liftoffproject.models.Customer;
import com.auntielizllc.liftoffproject.models.dto.NewClientFormDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
@RequestMapping("schedule-appointment/new-client-form")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping
    public String displayNewClientFormPage(Model model) {
        model.addAttribute(new NewClientFormDTO());
        return "new_client_form";
    }

    @PostMapping
    public String processNewClientForm(@ModelAttribute @Valid NewClientFormDTO newClientFormDTO,
                                       Errors errors, HttpServletRequest request,
                                       Model model) {

        if (errors.hasErrors()) {
            return "new_client_form";
        }

        Customer newCustomer = new Customer(newClientFormDTO.getFirstName(), newClientFormDTO.getLastName());
        customerRepository.save(newCustomer);

        return "redirect:"; 
    }
}
