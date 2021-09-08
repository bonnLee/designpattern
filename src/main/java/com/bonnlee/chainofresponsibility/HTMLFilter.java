package com.bonnlee.chainofresponsibility;

public class HTMLFilter implements MsgFilter {
    @Override
    public Message doFilter(Message msg) {
        String content = msg.getContent();
        //模拟业务实现
        content = content.replace("<","【");
        content = content.replace(">","】");
        msg.setContent(content);
        return msg;
    }
}
