package com.keithwedinger.springreactive.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Greeting {
    private String message;

    @Override
    public String toString() {
        return "Greeting {" + "message='" + message + '\'' +'}';
    }
}
