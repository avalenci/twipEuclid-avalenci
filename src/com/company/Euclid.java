package com.company;

class Euclid {
    static int iterative(int s, int b) {
        if (s == 0)
            return b;
        else if (b == 0)
            return s;
        int temp;
        if (b < s) {
            temp = s;
            s = b;
            b = temp;
        }
        if (b % s == 0)
            return s;
        int count = 2;
        while (true) {
            if (s % count == 0 && b % (s/count) == 0)
                return s/count;
            count++;
        }
    }
    public static int recursive(int s, int b, int c) {
        if (c == 0) {
            if (s == 0)
                return b;
            else if (b == 0)
                return s;
            else if (b < s)
                return recursive(b, s, c + 1);
            else
                return recursive(s, b, c + 1);
        }
        else {
            if (b%s != 0)
                return recursive(b % s, s, c);
            else
                return s;
        }
    }
}
