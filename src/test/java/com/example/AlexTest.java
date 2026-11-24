package com.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class AlexTest {
    private Alex alex;

    @Mock
    Feline feline;

    @BeforeEach
    public void setUp() throws Exception {
        alex = new Alex(feline);
    }

    @Test
    public void shouldReturnFriends() throws Exception {
        List<String> expectedFriends = List.of("Марти", "Глория", "Мелман");

        assertEquals(expectedFriends, alex.getFriends());
    }

    @Test
    public void shouldReturnPlaceOfLiving() throws Exception {

        assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }

    @Test
    public void shouldReturnZeroKittens() throws Exception {

        assertEquals(0, alex.getKittens());
    }

    @Test
    public void shouldBeMaleAndHaveMane() throws Exception {

        assertTrue(alex.doesHaveMane());
    }
}