package com.bonnlee.strategy.normal;

/*
活动类型 枚举
 */
public enum ActivityTypeEnum {
    FreePostage("1","免邮费"),
    FullDelivery("2","满减"),
    LimitDisCount("3","限时折扣");

    private String code;
    private String desc;

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    ActivityTypeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
