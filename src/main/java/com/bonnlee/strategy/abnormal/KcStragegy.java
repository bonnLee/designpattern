package com.bonnlee.strategy.abnormal;

public class KcStragegy implements PriceStragegy{


    @Override
    public double calculationPrice(double originalPrice) {
        return originalPrice ;  //快车
    }
}
