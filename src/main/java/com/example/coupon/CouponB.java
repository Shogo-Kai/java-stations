package com.example.coupon;
import java.util.Arrays;

public class CouponB {
    public float calculate(int[] cartItems) {
        int sum = Arrays.stream(cartItems).sum();
        if(sum * 0.9F < 5000) {
            return sum * 0.9F + 800;
        } else {
            return sum * 0.9F;
        }
    }
}
