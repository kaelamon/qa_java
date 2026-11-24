package com.example;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class LionParameterizedTest {

    @Mock
    FelineInterface feline;

    @ParameterizedTest
    @CsvSource({
            "Самец, true",
            "Самка, false"
    })
    public void shouldHaveManeDependingOnSex(String sex, boolean expected) throws Exception {
        Lion lion = new Lion(sex, feline);

        assertEquals(expected, lion.doesHaveMane());
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 3, 5})
    public void shouldReturnKittenCount(int kittensCount) throws Exception {
        when(feline.getKittens()).thenReturn(kittensCount);

        Lion lion = new Lion("Самец", feline);

        assertEquals(kittensCount, lion.getKittens());
    }
}