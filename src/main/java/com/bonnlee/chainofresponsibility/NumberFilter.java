package com.bonnlee.chainofresponsibility;

public class NumberFilter implements MsgFilter {
    @Override
    public Message doFilter(Message msg) {
        String content = msg.getContent();
        //模拟业务实现
        content = content.replace("1523333","1**3");
        msg.setContent(content);
        return msg;
    }
}
