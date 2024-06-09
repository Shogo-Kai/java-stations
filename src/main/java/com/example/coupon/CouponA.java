package com.example.coupon;
import java.util.Arrays;

public class CouponA {
    public float calculate(int[] cartItems) {
        int sum = Arrays.stream(cartItems).sum();
        return sum;
    }
}
