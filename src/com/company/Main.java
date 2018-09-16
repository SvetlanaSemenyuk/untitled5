package com.company;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        double g = 9.8, t;
        int h =0;
        Scanner in = new Scanner(System.in);
        System.out.println("Высота равна h:");
        h=in.nextInt(h);
        System.out.println("Скорость падения равна g" + g);
        t = Math.sqrt(2 * h) / g;
        System.out.println(t);

    }
}
