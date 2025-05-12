package ru.ls.aqa.school.core;

public class PointTask {
    public static void main(String[] args) {
        Point p1 = new Point(2, 2);
        Point p2 = new Point(-1, -2);

        System.out.println("Расстояние между " + p1 + " и " + p2 + " = " + p2.distance(p1));
    }
}
