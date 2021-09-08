package com.bonnlee.chainofresponsibility;

public class SmileFilter implements MsgFilter {
    @Override
    public boolean doFilter(Message msg) {
        String content = msg.getContent();
        //模拟业务实现
        content = content.replace(":)","^_^");
        msg.setContent(content);
        //boolean做控制 决定链条是否终止
        return true;
    }
}
