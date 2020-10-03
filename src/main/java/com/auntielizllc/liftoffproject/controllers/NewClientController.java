package com.auntielizllc.liftoffproject.controllers;

import com.auntielizllc.liftoffproject.data.NewClientRepository;
import com.auntielizllc.liftoffproject.models.NewClient;
import com.auntielizllc.liftoffproject.models.dto.LoginFormDTO;
import com.auntielizllc.liftoffproject.models.dto.NewClientFormDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
public class NewClientController {

    @Autowired
    NewClientRepository newClientRepository;

    @GetMapping("schedule-appointment/new-client-form")
    public String displayNewClientFormPage(Model model) {
        model.addAttribute(new NewClientFormDTO());
        return "new_client_form";
    }

    @PostMapping("/schedule-appointment/new-client-form")
    public String processNewClientForm(@ModelAttribute @Valid NewClientFormDTO newClientFormDTO,
                                       Errors errors, HttpServletRequest request,
                                       Model model) {

        if (errors.hasErrors()) {
            return "new_client_form";
        }

        NewClient newClient = new NewClient(newClientFormDTO.getFirstName(), newClientFormDTO.getLastName());
        newClientRepository.save(newClient);

        return "redirect:";
    }
}
