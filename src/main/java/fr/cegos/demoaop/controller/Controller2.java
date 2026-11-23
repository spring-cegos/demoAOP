package fr.cegos.demoaop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("controller2")
class Controller2 {
    @GetMapping
    public String getController2() {
        return "controller 2 Ok";
    }
}
