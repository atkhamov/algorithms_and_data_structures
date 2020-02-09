package com.atkhamov.selftraining;

public class CW_KeepHydrated {
    public static void main(String[] args) {
        System.out.println(Liters(6.7));

    }

    public static int Liters(double time){
        int litres = 0;
        litres = (int)time * 1/2;
        return litres;
    }

}
