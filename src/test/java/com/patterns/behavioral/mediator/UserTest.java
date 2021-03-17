package com.patterns.behavioral.mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {


    @Test
    void send() {
        User user = new User(new Telegram(),"Juan");
        User user2 = new User(new Telegram(),"Teresa");
        user.send("hola");
        user.mediator.sendMessage("hola",user);
        assertNotNull(user);


    }

    @Test
    void receive() {
        String sentm = "hi";
        String receviedm = "";
        User user = new User(new Telegram(),"Juan");
        User user2 = new User(new Telegram(),"Teresa");
        user.send(sentm);
        user.mediator.sendMessage("hola",user2);
        assertNotSame(user,user2);


    }
}