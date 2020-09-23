package com.auntielizllc.liftoffproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ScheduleAppointmentController {

    @GetMapping("schedule-appointment")
    public String displayScheduleAppointment () {
        return "schedule_appointment";
    }

}
