package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class DIntArray {

    private int[] a;



    public void add(int num) {
        if (a == null) {
            a = new int[1];
            a[0] = num;
        }
        else {
            int[] b = new int[a.length + 1];

            System.arraycopy(a, 0, b, 0, a.length);
//        b = Arrays.copyOf(a, a.length + 1);
            b[a.length] = num;
//        System. arraycopy(b, 0, a, 0, b.length);
            a = Arrays.copyOf(b, b.length);
        }

    }

    public void atInsert(int pos, int num){
        int[] b = new int[a.length + 1];
        System. arraycopy(a, 0, b, 0, a.length);
        System. arraycopy(a, pos, b, pos + 1, a.length - pos);
        b[pos] = num;
        a = Arrays.copyOf(b, b.length);

    }

    public void atDelete(int pos){
        int[] b = new int[a.length - 1];
        System. arraycopy(a, 0, b, 0, a.length -1);
        System. arraycopy(a, pos + 1, b, pos, a.length - pos - 1);
        a = Arrays.copyOf(b, b.length);
//        System. arraycopy(a, 0, b, 0, a.length);

    }

    public int at(int pos){
        return a[pos];
    }

    public String printA() {
        return Arrays.toString(a);
    }

    public static void main(String[] args) {
        DIntArray example = new DIntArray();
        example.add(1);
        example.add(2);
        example.add(3);
        example.add(4);
        example.add(5);
        example.add(6);
        example.add(7);
        System.out.println(example.printA());
        example.atInsert(4,3);
        System.out.println(example.printA());
        example.atDelete(4);
        System.out.println(example.printA());
        System.out.println(example.at(4));

    }
}

