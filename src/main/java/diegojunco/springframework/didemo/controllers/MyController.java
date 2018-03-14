package diegojunco.springframework.didemo.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by Diego Junco on 14/03/2018
 **/
@Controller
public class MyController {

    public String hello(){
        System.out.println("Hello!!! ");
        return "foo";
    }
}
