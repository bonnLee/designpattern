package com.bonnlee.chainofresponsibility;

public class HTMLFilter implements MsgFilter {
    @Override
    public boolean doFilter(Message msg) {
        String content = msg.getContent();
        //模拟业务实现
        content = content.replace("<","【");
        content = content.replace(">","】");
        msg.setContent(content);

        //boolean做控制 决定链条是否终止
        return true;
    }
}
