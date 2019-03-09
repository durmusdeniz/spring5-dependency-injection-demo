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

    /*To mimic the @Qualifier annotation, you can change the name of the variable to the implementation class, then Spring
    * can make a reflection to automatically inject it
    *
    * i.e below will inject SetterGreetingService
    *
    * public GreetingService setterGreetingService
    *
    * */


    public String sayHello(){
        return greetingService.sayGreeting();
    }



}
