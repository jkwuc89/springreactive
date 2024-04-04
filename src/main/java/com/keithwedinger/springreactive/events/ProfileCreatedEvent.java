package com.keithwedinger.springreactive.events;

import com.keithwedinger.springreactive.entities.Profile;
import org.springframework.context.ApplicationEvent;

public class ProfileCreatedEvent extends ApplicationEvent {
    public ProfileCreatedEvent(Profile source) {
        super(source);
    }
}
