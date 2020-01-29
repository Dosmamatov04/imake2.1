package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("здравствуйте");
        generateRandomAge();
    }

    public static void generateRandomAge() {

        Random rand = new Random();
        for (int i = 0; i < 100; i++) {


            System.out.println(rand.nextInt(100 + 1));

        }

    }


}

