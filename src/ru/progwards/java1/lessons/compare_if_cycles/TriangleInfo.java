package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleInfo {
    public static boolean isTriangle(int a, int b, int c){
        if ((a + b) > c && (a + c) > b && (b + c) > a)
            return true;
        else
            return false;
    }

    public static boolean isRightTriangle(int a, int b, int c){
        if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a)
            return true;
            else
                return false;
    }

    public static boolean isIsoscelesTriangle(int a, int b, int c){
        if (a == b || b == c || a == c)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println("Это треугольник? Ответ: " + isTriangle(3, 4, 7));
        System.out.println("Это прямоугольный треугольник? Ответ: " + isRightTriangle(3, 4, 4));
        System.out.println("Это равнобедренный треугольник? Ответ: " + isIsoscelesTriangle(3, 3, 3));
    }
}
