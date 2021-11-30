package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerAdvancedTest {
    @Test
    public void shouldGetAndSet() {
        ConditionerAdvanced conditioner = new ConditionerAdvanced();
        String expected = "Кондишн";

        assertNull(conditioner.getName());
        conditioner.setName(expected);
        assertEquals(expected, conditioner.getName());

        conditioner.setMaxTemperature(10);
        assertEquals(10, conditioner.getMaxTemperature());

        conditioner.setMinTemperature(1);
        assertEquals(1, conditioner.getMinTemperature());

        conditioner.setCurrentTemperature(5);
        assertEquals(5, conditioner.getCurrentTemperature());

        conditioner.setCurrentTemperature(15);
        assertEquals(5, conditioner.getCurrentTemperature());

        conditioner.setCurrentTemperature(0);
        assertEquals(5, conditioner.getCurrentTemperature());

        assertEquals(false, conditioner.isOn());
        conditioner.setOn(true);
        assertEquals(true, conditioner.isOn());
    }
}