package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class Eratosthenes {

    private boolean[] sieve;

    public Eratosthenes(int N){
        sieve = new boolean[N];

//        for (int i = 0; i < sieve.length; i++) {
//            sieve[i] = true;
//        }
        Arrays.fill(sieve, true);
        this.sift();

    }

    private void sift(){
        int N = sieve.length;
//        int p = 2;
        for (int i = 2; i < N; i++){
            for (int j = 2; (j * i) < N; j++){
                sieve[j * i] = false;
            }

        }

    }

    public boolean isSimple(int n){
        return sieve[n];
    }


}


