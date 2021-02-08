package com.company;

import java.util.Scanner;

public class formula {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Your first number: ");
        int number_one = in.nextInt();
        System.out.print("Your second number: ");
        int number_two = in.nextInt();
        System.out.print("Enter L: ");
        double L = in.nextDouble();
        double z = (Math.sin(number_one * L) / (1 + Math.cos(number_one * L))) * (Math.cos(number_two * L) / (1 + Math.cos(number_two * L)));
        System.out.println(z);
        in.close();
    }

}
