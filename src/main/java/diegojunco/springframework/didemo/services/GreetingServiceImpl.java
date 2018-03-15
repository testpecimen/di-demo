package diegojunco.springframework.didemo.services;

import org.springframework.stereotype.Service;

/**
 * Created by Diego Junco on 15/03/2018
 **/
@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_GURUS = "Hello Gurus from property!!!!";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }
}
