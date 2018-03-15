package diegojunco.springframework.didemo.services;

import org.springframework.stereotype.Service;

/**
 * Created by Diego Junco on 15/03/2018
 **/
@Service
public class SetterGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello - I was injected by the setter";
    }
}
