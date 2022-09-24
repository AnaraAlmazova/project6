package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int [] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
            System.out.println(array [i]);

        }

    }
}
