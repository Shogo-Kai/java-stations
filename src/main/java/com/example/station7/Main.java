package com.example.station7;

public class Main {
    public static void main(String[] args) {
        int[] itemPrices = { 1200, 2300, 3500, 2500, 1000, 2980, 9800, 4600, 5000, 2000 };
        int prices = 0;
        for(int i = 0; i < itemPrices.length; i++) {
            prices += itemPrices[i];
        }
        System.out.println(prices);
        // ここから
        // ここまで
    }
}
