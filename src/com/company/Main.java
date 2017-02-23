package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int it = Euclid.iterative(n1, n2);
        int re = Euclid.recursive(n1, n2);
        if (it == re) {
            System.out.println(it);
        }
    }
}
