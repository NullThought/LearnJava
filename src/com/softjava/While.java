package com.softjava;

public class While {
    public static void main(String[] args) {
        int sum = 0;
        int n = 1;
        while (n <= 100) {
            sum = sum + n;
            n ++;
        }
        System.out.println(sum);
    }
}
