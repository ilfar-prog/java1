package ru.progwards.java1.lessons.basics;

public class ReverseDigits {
    public static int reverseDigits(int number){
        int first;
        first = number % 10 * 100;
        int ten_int;
        ten_int = number / 10;
        int second;
        second = ten_int % 10 * 10;
        int hundred_int;
        hundred_int = number / 100;
        int third;
        third = hundred_int;
        return first + second + third;


    }

    public static void main(String[] args){
        int test;
        test = reverseDigits(457);
        System.out.println(test);
    }
}
