package diegojunco.springframework.didemo.controllers;

import diegojunco.springframework.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Diego Junco on 15/03/2018
 **/
public class SetterInjectedControllerTest {

    private SetterInjectedController setterInjectedController;

    @Before
    public void setUp() throws Exception{
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception{
        assertEquals(GreetingServiceImpl.HELLO_GURUS, setterInjectedController.sayHello());
    }
}