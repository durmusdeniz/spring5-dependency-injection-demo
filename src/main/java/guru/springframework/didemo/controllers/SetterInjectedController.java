package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingServiceImpl;

public class SetterInjectedController {




    private GreetingServiceImpl greetingService;

    String sayHello(){
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingServiceImpl greetingService){
        this.greetingService = greetingService;
    }


}
