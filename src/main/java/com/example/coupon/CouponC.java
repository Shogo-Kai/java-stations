package com.example.coupon;

public class CouponC {
    public float calculate(int[] cartItems) {
        int sum = 0;
        for(int i = 0; i < cartItems.length; i++) {
            if(cartItems[i] >= 2000) {
                sum += cartItems[i] * 0.8;
            } else {
                sum += cartItems[i];
            }
        }
        if(sum < 5000) {
            return sum + 800;
        } else {
            return sum;
        }
    }
}
