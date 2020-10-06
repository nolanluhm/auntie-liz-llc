package com.auntielizllc.liftoffproject.controllers;

import com.auntielizllc.liftoffproject.data.CustomerRepository;
import com.auntielizllc.liftoffproject.models.AppointmentType;
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

import javax.validation.Valid;

@Controller
@RequestMapping("schedule-appointment/new-client-form")
public class NewClientFormController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping
    public String displayNewClientFormPage(Model model) {
        model.addAttribute("title", "New Client Form — Auntie Liz, LLC");
        model.addAttribute(new NewClientFormDTO());
        model.addAttribute("types", AppointmentType.values());
        return "new_client_form";
    }

    @PostMapping
    public String processNewClientForm(@ModelAttribute @Valid NewClientFormDTO newClientFormDTO,
                                       Errors errors, Model model) {

        if (errors.hasErrors()) {
            model.addAttribute("title", "New Client Form — Auntie Liz, LLC");
            return "new_client_form";
        }

        Customer newCustomer = new Customer(newClientFormDTO.getFirstName(), newClientFormDTO.getLastName(), newClientFormDTO.getEmail(),
                                            newClientFormDTO.getPhoneNumber(), newClientFormDTO.getAddress(), newClientFormDTO.getAddress2(),
                                            newClientFormDTO.getCity(), newClientFormDTO.getState(), newClientFormDTO.getZipCode(), newClientFormDTO.getGeneralHousekeeping(),
                                            newClientFormDTO.getLaundry(), newClientFormDTO.getDishes(), newClientFormDTO.getCarpetShampooing(), newClientFormDTO.getWallCleaning(),
                                            newClientFormDTO.getCarWash(), newClientFormDTO.getPetNailTrim(), newClientFormDTO.getPetEarCleaning(),
                                            newClientFormDTO.getPetAnalGlandExpression(), newClientFormDTO.getPetMedicine(), newClientFormDTO.getType(),
                                            newClientFormDTO.getInstructions(), newClientFormDTO.getNursingHomeEmployee(), newClientFormDTO.getVeteran(),
                                            newClientFormDTO.getSeniorCitizen(), newClientFormDTO.getSignature());
        customerRepository.save(newCustomer); 

        return "redirect:"; 
    }
}
