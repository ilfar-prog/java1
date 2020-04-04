package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class ArraySort {
    public static void sort(int[] a){
        for (int i = 0; i < a.length ; i++){
            for (int j = i + 1; j < a.length; j++){
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }



        }
    }

    public static void printArray( int[] intArray) {
        for (int value : intArray) {
            System.out.println("Элемент " + value);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {0, 144, 34, 55, 89, 21};
//        int[] b = a;
        int[] b = Arrays.copyOf(a, a.length);
        System.out.println(Arrays. toString(a));
        sort(b);
        System.out.println(Arrays. toString(b));
//        printArray(a);
//        printArray(b);
    }
}
