package ru.ls.aqa.school.core;

// обьявляется публичный класс Point, для точек и проскости
public class Point {
    public float x;          //
    public float y;          // координаты

    // Конструктор, вызывается, когда создается новый обьект Point
    public Point(float x, float y) {
        this.x = x;    //
        this.y = y;    // установить значение x и y для текущего обьекта

    }
    // Метод класса для вычисления расстояния до другой точки
    public float distance(Point point) {
        float dx = this.x - point.x;    // разности координат
        float dy = this.y - point.y;    // разности координат
        return (float) Math.sqrt(dx * dx + dy * dy);   // вычисления квадратного корня.

    }
    // для отображения координатов в виде (x, y)
    public String toString1 () {
        return "(" + x + ", " + y + ")";
    }

}



