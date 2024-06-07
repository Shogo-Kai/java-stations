package com.example.station6;

public class Main {
    public static void main(String[] args) {
        // ここから
        int[] users = {23, 36, 31, 48, 58};
        int all = 0;
        for(int i = 0; i < users.length; i++) {
            all += users[i];
        }
        System.out.println(all/5.0);
        // ここまで
    }
}
