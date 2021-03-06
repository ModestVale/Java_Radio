package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    @Test
    void stationNumber_setValidValue() {
        Radio radio = new Radio();
        radio.next();
        assertEquals(1, radio.getNumberStation());
        radio.setNumberStation(5);
        assertEquals(5, radio.getNumberStation());
        radio.prev();
        assertEquals(4, radio.getNumberStation());
    }

    @Test
    void stationNumber_setInValidValue() {
        Radio radio = new Radio();
        radio.prev();
        assertEquals(9, radio.getNumberStation());
        radio.setNumberStation(15);
        assertEquals(9, radio.getNumberStation());
        radio.setNumberStation(-5);
        assertEquals(9, radio.getNumberStation());
        radio.next();
        assertEquals(0, radio.getNumberStation());
    }

    @Test
    void volume_setValidValues() {
        Radio radio = new Radio();
        assertEquals(0, radio.getVolume());
        radio.increaseVolume();
        assertEquals(1, radio.getVolume());
        radio.decreaseVolume();
        assertEquals(0, radio.getVolume());
    }

    @Test
    void volume_setInValidValues() {
        Radio radio = new Radio();
        assertEquals(0, radio.getVolume());
        radio.decreaseVolume();
        assertEquals(0, radio.getVolume());

        for (int i = 0; i < 11; i++) {
            radio.increaseVolume();
        }
        assertEquals(10, radio.getVolume());
    }
}
