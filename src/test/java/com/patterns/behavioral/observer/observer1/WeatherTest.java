package com.patterns.behavioral.observer.observer1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WeatherTest {
    private List<WeatherObserver> weatherObservers;

    @BeforeEach
    void comienzo(){
        //para crear los casos de test por cada llamada se limpiará la lista de observadores
        weatherObservers = new ArrayList<>();
        WeatherObserver computer = new Computer();
        WeatherObserver smartphone = new Smartphone();
        assertTrue(computer instanceof  WeatherObserver);
        assertTrue(computer instanceof Computer);
        assertTrue(smartphone instanceof WeatherObserver);
        assertTrue(smartphone instanceof Smartphone);
    }
    @Test
    @DisplayName("Instancia Weather con lista vacia")
    void crearWeather(){
        Weather weather = new Weather();
        Computer computer = new Computer();
        WeatherObserver smartphone = new Smartphone();
        weather.addObserver(computer);
        weather.addObserver(smartphone);
        weather.changeWeather(WeatherType.SUNNY);
        assertTrue(computer.getReceivedMessages().contains("Computer has been notified of weather change: " + WeatherType.SUNNY));

    }

    @Test
    @DisplayName("Añadir Observador")
    void addObserver() {
        Computer computer = new Computer();
        Weather weather = new Weather();
        weather.addObserver(computer);

        //si están añadidos se puede notificar
        weather.changeWeather(WeatherType.CLOUDY);
        List<String> messages = computer.getReceivedMessages();
        computer.setReceivedMessages(messages);
        assertFalse(computer.getReceivedMessages().contains("Computer has been notified of weather change: " + WeatherType.SUNNY));

    }

    @Test
    @DisplayName("Eliminar Observador")
    void removeObserver() {
        int size = 0;
        Weather weather = new Weather();
        Computer computer = new Computer();
        weather.addObserver(computer);
        weather.changeWeather(WeatherType.CLOUDY);
        assertTrue(computer.getReceivedMessages().contains("Computer has been notified of weather change: " +WeatherType.CLOUDY));
        weather.removeObserver(computer);
        weather.changeWeather(WeatherType.RAINY);
        assertFalse(computer.getReceivedMessages().contains("Computer has been notified of weather change: " +WeatherType.RAINY));



    }

    @Test
    @DisplayName("cambiar el tiempo")//parametros
    void changeWeather() {
        Weather weather = new Weather();
        Computer computer = new Computer();
        computer.update(WeatherType.RAINY);
        assertTrue(computer.getReceivedMessages().contains("Computer has been notified of weather change: " +WeatherType.RAINY));
        weather.addObserver(computer);
        weather.changeWeather(WeatherType.CLOUDY);
        weather.addObserver(computer);
        assertTrue(computer.getReceivedMessages().contains("Computer has been notified of weather change: " +WeatherType.CLOUDY));


    }
}