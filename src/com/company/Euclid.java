package com.company;

public class Euclid {
    public static int iterative(int n1, int n2) {
        int small, big;
        if (n1 < n2) {
            small = n1;
            big = n2;
        }
        else {
            small = n2;
            big = n2;
        }
        if (big % small == 0)
            return small;
    }
    /*public static int recursive(int n1, int n2) {

    } */
}
