package com.bonnlee.chainofresponsibility;

import java.util.ArrayList;
import java.util.List;

public class MsgFilterChain implements MsgFilter{

    List<MsgFilter> msgFilterList = new ArrayList<>();

    public MsgFilterChain add(MsgFilter msgFilter){
        msgFilterList.add(msgFilter);
        return this;
    }

    @Override
    public Message doFilter(Message msg){
        msgFilterList.forEach(item ->{
            item.doFilter(msg);
        });
        return msg;
    }
}
