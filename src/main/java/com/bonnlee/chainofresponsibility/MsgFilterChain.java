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
    public boolean doFilter(Message msg){
        for (MsgFilter msgFilter : msgFilterList) {
            if(!msgFilter.doFilter(msg)) return false;
        }
        return true;
    }
}
