package com.bonnlee.singleton;

public enum EffectiveEnum implements AAA {

    INSTANCE;
    private String name;


    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static EffectiveEnum getInstance(){
        return INSTANCE;
    }


    public static void main(String[] args) {
//        for (int i = 0; i < 50; i++) {
//            new Thread(()-> System.out.println(EffectiveEnum.INSTANCE.hashCode())).start();
//        }
        EffectiveEnum effectiveEnum = EffectiveEnum.getInstance();
        effectiveEnum.setName("666");
        String name = effectiveEnum.getName();

        String name1 = EffectiveEnum.getInstance().getName();

        System.out.println(name);
        System.out.println(name1);
    }


}
