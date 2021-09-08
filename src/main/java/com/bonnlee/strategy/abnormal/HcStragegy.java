package com.bonnlee.strategy.abnormal;

public class HcStragegy implements PriceStragegy{


    @Override
    public double calculationPrice(double originalPrice) {
        return originalPrice * 2;  //豪车,加价
    }
}
