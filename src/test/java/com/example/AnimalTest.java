package com.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AnimalTest {

    Animal animal = new Animal();

    @Test
    public void shouldReturnHerbivoreFood() throws Exception {
        List<String> expectedFood = List.of("Трава", "Различные растения");

        assertEquals(expectedFood, animal.getFood("Травоядное"));
    }

    @Test
    public void shouldReturnPredatorFood() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");

        assertEquals(expectedFood, animal.getFood("Хищник"));
    }

    @Test
    public void shouldThrowExceptionForUnknownAnimalKind() {
        Exception exception = assertThrows(
                Exception.class,
                () -> animal.getFood("Неизвестно")
        );

        assertEquals(
                "Неизвестный вид животного, используйте значение Травоядное или Хищник",
                exception.getMessage()
        );
    }

    @Test
    public void shouldReturnAnimalFamily() {
        assertEquals(
                "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи",
                animal.getFamily()
        );
    }
}