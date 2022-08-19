package com.hillel.huberskyi.homework18;

import com.hillel.huberskyi.homeworks.homework18.Array;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArrayTest {

    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    @Test
    public void element() {
        assertEquals(3,Array.findElement(array,4));
    }

    @Test
    public void sorted() {
        assertTrue(Array.isSorted(array));
    }
}
