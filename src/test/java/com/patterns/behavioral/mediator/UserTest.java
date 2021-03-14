package com.patterns.behavioral.mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {


    @Test
    void send() {
        User user = new User(new Telegram(),"hola");
        user.send("hola");
        user.mediator.sendMessage("hola",user);


    }

    @Test
    void receive() {
    }
}