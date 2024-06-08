package com.example.station9;

public class Main {
    public static void main(String[] args) {
        int[] itemPrices1 = {1000, 1100, 1200, 1300};
        int[] itemPrices2 = {1000, 1100, 1200, 1300, 1600, 1800};
        int[] itemPrices3 = {1000, 2100, 3200, 2300};
        System.out.print("カート内: 1000円, 1100円, 1200円, 1300円。期待されるクーポン: A。結果: ");
        test(itemPrices1);
        System.out.print("カート内: 1000円, 1100円, 1200円, 1300円, 1600円, 1800円。期待されるクーポン: B。結果: ");
        test(itemPrices2);
        System.out.print("カート内: 1000円, 2100円, 3200円, 2300円。期待されるクーポン: C。結果: ");
        test(itemPrices3);
    }

    public static void test(int[] itemPrices) {
        // ここから
        int totalA = 0;
        int totalB = 0;
        int totalC = 0;

        for(int i = 0; i < itemPrices.length; i++) {
            totalA += itemPrices[i];
            totalB += itemPrices[i] * 0.9;
            if(itemPrices[i] >= 2000) {
                totalC += itemPrices[i] * 0.8;
            } else if(itemPrices[i] < 2000) {
                totalC += itemPrices[i];
            }
        }
        
        if(totalA < 5000) {
            totalB += 800;
            totalC += 800;
        }

        if(totalA >= totalB) {
            if(totalB >= totalC) {
                System.out.println("C");
            } else {
                System.out.println("B");
            }
        } else if(totalA >= totalC) {
            System.out.println("C");
        } else {
            System.out.println("A");
        }

        // ここまで
    }
}
