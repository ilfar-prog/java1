package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {
    public static double volumeBallDouble(double radius){
        double W;
        W = 4.0 / 3.0 * 3.14 * radius * radius * radius;
        return W;
    }

    public static float volumeBallFloat(float radius){
        float W;
        W = 4f / 3f * 3.14f * radius * radius * radius;
        return W;
    }

    public static double calculateAccuracy(double radius){
        double volume_ball_double;
        float volume_ball_float;
        volume_ball_double = volumeBallDouble(radius);
        volume_ball_float = volumeBallFloat((float)radius);
        double Accuracy;
        Accuracy =  volume_ball_double - volume_ball_float;
        return Accuracy;
    }

    public static void main(String[] args){
        double volume_calc_test_double;
        volume_calc_test_double = volumeBallDouble(1);
        System.out.print("Объем сферы радиуса 1 равен ");
        System.out.println(volume_calc_test_double);

        float volume_calc_test_float;
        volume_calc_test_float = volumeBallFloat(1f);
        System.out.print("Объем сферы радиуса 1 равен ");
        System.out.println(volume_calc_test_float);

        double W_earth;
        W_earth = volumeBallDouble(6371.2);
        System.out.print("Объем планеты Земля ");
        System.out.print(W_earth);
        System.out.println(" куб. км");

        double double_minus_float;
        double_minus_float = calculateAccuracy(6371.2);

        System.out.print("Погрешность float равна ");
        System.out.println(double_minus_float);
    }

}
