package guru.springframework.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"en","default"})
@Primary
public class PrimaryGreetingService implements GreetingService {
    public static String HELLO_PRIMARY = "Hello World - Primary dependecy Injected !";

    @Override
    public String sayGreeting() {
        return HELLO_PRIMARY;
    }
}
