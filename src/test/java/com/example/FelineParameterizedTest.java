package com.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FelineParameterizedTest {

    Feline feline = new Feline();

    @ParameterizedTest
    @ValueSource(ints = {0, 2, 5})
    public void shouldReturnSpecifiedKittenCount(int kittensCount) {
        assertEquals(kittensCount, feline.getKittens(kittensCount));
    }
}
