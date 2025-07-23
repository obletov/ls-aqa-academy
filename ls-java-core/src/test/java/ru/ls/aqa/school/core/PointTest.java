package ru.ls.aqa.school.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PointTest {
    @Test
    void distanceToSelfShouldBeZero() {
        Point p = new Point(1.0f, 2.0f);
        assertEquals(0.0f, p.distance(p), 0.0001f);
    }

    @Test
    void distanceToAnotherPoint() {
        Point p1 = new Point(0.0f, 0.0f);
        Point p2 = new Point(3.0f, 4.0f);
        assertEquals(5.0f, p1.distance(p2), 0.0001f);
    }

    @Test
    void distanceWithNegativeCoordinates() {
        Point p1 = new Point(-1.0f, -1.0f);
        Point p2 = new Point(-4.0f, -5.0f);
        assertEquals(5.0f, p1.distance(p2), 0.0001f);
    }

    @Test
    void distanceWithNegativeCoordinates1() {
        Point p1 = new Point(-1.0f, -1.0f);
        Point p2 = new Point(4.0f, 5.0f);
        assertEquals(7.81025, p1.distance(p2), 0.0001f);
        assertEquals(p2.distance(p1), p1.distance(p2), 0.0001f);
    }

}



