package com.bonnlee.strategy.abnormal;

public class Main {
    /*
    使用策略模式的优点：
    1.避免多重条件判断
    2.扩展性良好：在现有系统中增加一个策略很方便，如果是正常逻辑模式则需要改动之前的代码
    缺点：
    1.当策略变多时，行为对象将变得庞大，考虑内存溢出

    abnormal包下为自定义形式的策略模式，以出租车计算价钱为例，拼车，快车，豪车价钱均不等
    考虑用设计模式实现。
     */
    public static void main(String[] args) {
        System.out.println(new PriceContext(new PcStragegy()).countPrice(52.4));
        System.out.println(new PriceContext(new KcStragegy()).countPrice(52.4));
        System.out.println(new PriceContext(new HcStragegy()).countPrice(52.4));
    }
}
