package org.example;

public class MultiplesOf3or5 {
    public static void main(String[] args) {
        int limit = 1000;
        int sum = simOfMultiples(3, limit) + simOfMultiples(5, limit) - simOfMultiples(15, limit);
        System.out.println(sum);
    }

    static int simOfMultiples(int k, int limit) {
        int p = (limit -1)/k;

        return k * p * (p + 1) / 2;
    }
}
