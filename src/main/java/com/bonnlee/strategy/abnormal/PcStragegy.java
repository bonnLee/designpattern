package com.bonnlee.strategy.abnormal;

public class PcStragegy implements PriceStragegy{


    @Override
    public double calculationPrice(double originalPrice) {
        return originalPrice / 2;  //拼车,打折
    }
}
