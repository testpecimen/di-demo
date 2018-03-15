package diegojunco.springframework.didemo.controllers;

import diegojunco.springframework.didemo.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Created by Diego Junco on 14/03/2018
 **/
@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        System.out.println("Hello!!! ");
        return greetingService.sayGreeting();
    }
}
