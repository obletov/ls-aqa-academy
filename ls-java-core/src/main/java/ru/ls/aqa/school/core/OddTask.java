package ru.ls.aqa.school.core;

public class OddTask {

    // Метод isOdd: возвращает true, если число нечетное, иначе false
    public static boolean isOdd (int number){
        return number % 2 !=0;   // остаток от деления на 2 не равен нулю ⇒ число нечётное.
    }

    // Это точка входа в программу.
    public static void main(String[] args) {
        System.out.println("Тестирование метода isOdd():");   // Сообщение

        int[] testNumbers = { 0, 1, 2, 3, 10, -1, -4, 99, 120, -223 };

        for (int testNumber : testNumbers) {
            System.out.println("Число " + testNumber + " нечетное? -> " + isOdd(testNumber));
        }
    }
}
