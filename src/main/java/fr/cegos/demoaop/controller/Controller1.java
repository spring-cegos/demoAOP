package fr.cegos.demoaop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("controller1")
class Controller1 {
    @GetMapping
    public String getController1() {
        return "controller 1 Ok";
    }
}
