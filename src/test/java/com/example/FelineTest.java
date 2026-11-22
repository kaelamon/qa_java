package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FelineTest {

    Feline feline = new Feline();


    @Test
    public void shouldReturnPredatorFood() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");

        assertEquals(expectedFood, feline.eatMeat());
    }

    @Test
    public void shouldReturnFelineFamily() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void shouldReturnOneKittenByDefault() {
        assertEquals(1, feline.getKittens());
    }

}
