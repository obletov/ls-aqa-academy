package ru.ls.aqa.school.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OddTaskTest {

    @Test
    void testIsOdd() {
        assertTrue(OddTask.isOdd(1));
        assertTrue(OddTask.isOdd(-3));
        assertFalse(OddTask.isOdd(2));
        assertFalse(OddTask.isOdd(0));
    }

}
