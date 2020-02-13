package ru.progwards.java1.lessons.basics;

public class Astronomy {
    public static Double sphereSquare(Double r){
        double S;
        S = 4 * 3.14 * r * r;
        return S;
    }
    public static Double earthSquare(){
        double S;
        final double R_EARTH = 6371.2;
        S = 4 * 3.14 * R_EARTH * R_EARTH;
        return S;
    }
    public static Double mercurySquare(){
        double S;
        final double R_MERCURY = 2439.7;
        S = 4 * 3.14 * R_MERCURY * R_MERCURY;
        return S;
    }
    public static Double jupiterSquare(){
        double S;
        final double R_JUPITER = 71492;
        S = 4 * 3.14 * R_JUPITER * R_JUPITER;
        return S;
    }
    public static Double earthVsMercury(){
        double otn;
        double s_earth;
        double s_mercury;
        s_earth = earthSquare();
        s_mercury = mercurySquare();
        otn = s_earth / s_mercury;
        return otn;
    }

    public static Double earthVsJupiter(){
        double otn;
        double s_earth;
        double s_jupiter;
        s_earth = earthSquare();
        s_jupiter = jupiterSquare();
        otn = s_earth / s_jupiter;
        return otn;
    }

    public static void main(String[] args){
        double R = 3;
        System.out.print("Площадь поверхности сферы радиусом ");
        System.out.print(R);
        System.out.print(" равна ");
        System.out.println(sphereSquare(R));

        System.out.print("Площадь поверхности Земли ");
        System.out.print(earthSquare());
        System.out.println(" кв.км");

        System.out.print("Площадь поверхности планеты Меркурий ");
        System.out.print(mercurySquare());
        System.out.println(" кв.км");

        System.out.print("Площадь поверхности планеты Юпитер ");
        System.out.print(jupiterSquare());
        System.out.println(" кв.км");

        System.out.print("Отношение площади поверхности Земли к площади поверхности планеты Меркурий ");
        System.out.println(earthVsMercury());

        System.out.print("Отношение площади поверхности Земли к площади поверхности планеты Юпитер ");
        System.out.println(earthVsJupiter());

    }
}
