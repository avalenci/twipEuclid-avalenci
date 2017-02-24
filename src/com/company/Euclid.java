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
            big = n1;
        }
        if (big % small == 0)
            return small;
        int count = 2;
        while (true) {
            if (small % count == 0 && big % (small/count) == 0)
                return small/count;
            count++;
        }
    }
    /*public static int recursive(int n1, int n2) {

    } */
}
