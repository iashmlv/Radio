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

}