package com.tech.gitactions.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data-action")
public class DataActionController {

    @GetMapping("/status")
    public String getStatus() {
        return "Data Action Controller is up and running!";
    }
}
