package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleSimpleInfo {
    public static int maxSide(int a, int b, int c){
        int max;
        if (a >= b && a >= c)
                max = a;
        else if (b >= a && b >= c)
            max = b;
        else //(c > a && c > b)
            max = c;
        return max;
    }

    public static int minSide(int a, int b, int c){
        int min;
        if (a <= b && a <= c)
            min = a;
        else if (b <= a && b <= c)
            min = b;
        else //(c <= a && c <= b)
            min = c;
        return min;
    }

    public static boolean isEquilateralTriangle(int a, int b, int c){

        if (a == b && b == c && a == c)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println("Наибольшая сторона: " + maxSide(3,5,10));
        System.out.println("Наименьшая сторона: " + minSide(3,5,10));
        System.out.println("Равносторонный треугольник? Ответ:  " + isEquilateralTriangle(4, 3, 3));
    }
}
