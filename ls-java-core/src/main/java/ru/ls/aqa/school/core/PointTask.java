package ru.ls.aqa.school.core;

public class PointTask {
    public static void main(String[] args) {
        Point p1 = new Point(3, 4);
        Point p2 = new Point(3, 4);


        System.out.println("Расстояние между " + p1 + " и " + p2 + " = " + p2.distance(p1));



    }
}
