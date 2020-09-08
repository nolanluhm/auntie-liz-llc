package com.auntielizllc.liftoffproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReviewsController {

    @GetMapping("reviews")
    public String displayReviews () {
        return "reviews";
    }
}
