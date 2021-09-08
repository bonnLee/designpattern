package com.bonnlee.chainofresponsibility;

public class SensitiveWordFilter implements MsgFilter {
    @Override
    public boolean doFilter(Message msg) {
        String content = msg.getContent();
        //模拟业务实现
        content = content.replace("小日本","米西米西");
        content = content.replace("996","被剥削式");
        msg.setContent(content);
        //boolean做控制 决定链条是否终止
        return false;
    }
}
