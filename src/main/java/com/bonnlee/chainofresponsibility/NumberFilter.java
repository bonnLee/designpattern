package com.bonnlee.chainofresponsibility;

public class NumberFilter implements MsgFilter {
    @Override
    public boolean doFilter(Message msg) {
        String content = msg.getContent();
        //模拟业务实现
        content = content.replace("1523333","1**3");
        msg.setContent(content);
        //boolean做控制 决定链条是否终止
        return false;
    }
}
