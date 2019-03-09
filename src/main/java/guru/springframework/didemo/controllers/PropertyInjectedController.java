package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingService;
import guru.springframework.didemo.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


//An example of everything not to do!
@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingServiceImpl greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }



}
