package com.bonnlee.chainofresponsibility;

public class SmileFilter implements MsgFilter {
    @Override
    public Message doFilter(Message msg) {
        String content = msg.getContent();
        //模拟业务实现
        content = content.replace(":)","^_^");
        msg.setContent(content);
        return msg;
    }
}
