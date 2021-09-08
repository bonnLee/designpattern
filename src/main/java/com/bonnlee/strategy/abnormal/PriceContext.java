package com.bonnlee.strategy.abnormal;

public class PriceContext {
    private PriceStragegy priceStragegy;

    public PriceContext(PriceStragegy priceStragegy) {
        this.priceStragegy = priceStragegy;
    }

    public double countPrice(double originalPrice){
        return priceStragegy.calculationPrice(originalPrice);
    }
}
