package app.model;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal {
    @Override
    public String toString() { return "I'm a Dog"; }
}
