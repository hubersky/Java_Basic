package com.hillel.huberskyi.homework17;

import com.hillel.huberskyi.homeworks.homework17.Array;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class ArrayTest {
    int[][] array = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

    @Test
    public void average() {
        assertEquals(8.5, Array.getAverage(array));
    }

    @Test
    public void square() {
        assertTrue(Array.arrayIsSquare(array));
    }
}
