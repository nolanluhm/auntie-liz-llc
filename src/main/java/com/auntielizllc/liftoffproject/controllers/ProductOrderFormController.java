package com.auntielizllc.liftoffproject.controllers;

import com.auntielizllc.liftoffproject.data.ProductOrderRepository;
import com.auntielizllc.liftoffproject.models.ProductOrder;
import com.auntielizllc.liftoffproject.models.dto.ProductOrderFormDTO;
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
@RequestMapping("products-and-pricing/product-order-form")
public class ProductOrderFormController {

    @Autowired
    ProductOrderRepository productOrderRepository;

    @GetMapping
    public String displayProductOrderFormPage(Model model) {
        model.addAttribute("title", "Product Order Form — Auntie Liz, LLC");
        model.addAttribute(new ProductOrderFormDTO());
        return "product_order_form";
    }

    @PostMapping
    public String processProductOrderForm(@ModelAttribute @Valid ProductOrderFormDTO productOrderFormDTO,
                                          Errors errors, Model model) {

        if (errors.hasErrors()) {
            model.addAttribute("title", "Product Order Form — Auntie Liz, LLC");
            return "product_order_form";
        }

        ProductOrder newOrder = new ProductOrder(productOrderFormDTO.getFirstName(), productOrderFormDTO.getLastName(),
                productOrderFormDTO.getEmail(), productOrderFormDTO.getPhoneNumber(), productOrderFormDTO.getAddress(),
                productOrderFormDTO.getAddress2(), productOrderFormDTO.getCity(), productOrderFormDTO.getState(),
                productOrderFormDTO.getZipCode(), productOrderFormDTO.getHandSoap(), productOrderFormDTO.getBarSoap(),
                productOrderFormDTO.getLotion(), productOrderFormDTO.getAllPurposeCleaner(), productOrderFormDTO.getAirFreshener(),
                productOrderFormDTO.getCandle(), productOrderFormDTO.getDoggieShampoo(), productOrderFormDTO.getPbTreat(),
                productOrderFormDTO.getOatmealTreat(), productOrderFormDTO.getTunaTreat(), productOrderFormDTO.getCatToy(),
                productOrderFormDTO.getBandanna(), productOrderFormDTO.getBowtie(), productOrderFormDTO.getQuantity(),
                productOrderFormDTO.getDeliveryMethod(), productOrderFormDTO.getPaymentMethod());
        productOrderRepository.save(newOrder);

        return "redirect:";
    }
}
