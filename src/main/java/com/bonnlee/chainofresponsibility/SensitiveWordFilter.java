package com.bonnlee.chainofresponsibility;

public class SensitiveWordFilter implements MsgFilter {
    @Override
    public Message doFilter(Message msg) {
        String content = msg.getContent();
        //模拟业务实现
        content = content.replace("小日本","米西米西");
        content = content.replace("996","被剥削式");
        msg.setContent(content);
        return msg;
    }
}
