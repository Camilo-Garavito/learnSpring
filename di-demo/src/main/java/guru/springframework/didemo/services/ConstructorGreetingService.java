package guru.springframework.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {
    public static final String HELLO_SETTER = "Hello World - Injected by the Constructor";

    @Override
    public String sayGreeting() {
        return HELLO_SETTER;
    }
}
