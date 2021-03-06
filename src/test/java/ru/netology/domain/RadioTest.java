package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldSetNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.setNextStation();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    void shouldSetNextStationLoop() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.setNextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldSetPreviousStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        radio.setPreviousStation();
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    void shouldSetPreviousStationLoop() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.setPreviousStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.increaseVolume();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    void shouldIncreaseVolumeLoop() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(6);
        radio.decreaseVolume();
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolumeLoop() {
        Radio radio = new Radio();
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