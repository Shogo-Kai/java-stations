package com.example.coupon;

public class CouponCalculator {
    CouponA couponA = new CouponA();
    CouponB couponB = new CouponB();
    CouponC couponC = new CouponC();

    public String findBestCoupon(int[] cartItems) {
        float sumA = couponA.calculate(cartItems);
        float sumB = couponB.calculate(cartItems);
        float sumC = couponC.calculate(cartItems);
        String idA = "A";
        String idB = "B";
        String idC = "C";
        
        if(sumA >= sumB) {
            if(sumB >= sumC) {
                return idC;
            } else {
                return idB;
            }
        } else {
            if(sumA >= sumC) {
                return idC;
            } else {
                return idA;
            }
        }
    }
}
