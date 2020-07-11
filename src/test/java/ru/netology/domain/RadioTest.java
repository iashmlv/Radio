package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio(10);

    @Test
    void shouldSetNextStation() {
        radio.setCurrentStation(5);
        radio.setNextStation();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    void shouldSetNextStationLoop() {
        radio.setCurrentStation(10);
        radio.setNextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldSetPreviousStation() {
        radio.setCurrentStation(6);
        radio.setPreviousStation();
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    void shouldSetPreviousStationLoop() {
        radio.setCurrentStation(0);
        radio.setPreviousStation();
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    void shouldIncreaseVolume() {
        radio.setCurrentVolume(60);
        radio.increaseVolume();
        assertEquals(61, radio.getCurrentVolume());
    }

    @Test
    void shouldIncreaseVolumeLoop() {
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolume() {
        radio.setCurrentVolume(60);
        radio.decreaseVolume();
        assertEquals(59, radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolumeLoop() {
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
    
    @Test
    void currentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        assertEquals(7, radio.getCurrentStation());
    }

    @Test
    void maxCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        assertEquals(9, radio.getMaxStation(), radio.getCurrentStation());
    }

    @Test
    void minCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        assertEquals(0, radio.getMinStation(), radio.getCurrentStation());
    }

    @Test
    void overMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(13);
        assertEquals(9, radio.getMaxStation(), radio.getCurrentStation());
    }

    @Test
    void underMinStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(-12);
        assertEquals(radio.getMinStation(), radio.getCurrentStation());
    }

}
