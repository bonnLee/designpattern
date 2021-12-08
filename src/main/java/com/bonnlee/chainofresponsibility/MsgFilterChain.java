package com.bonnlee.chainofresponsibility;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class MsgFilterChain implements MsgFilter {

    List<MsgFilter> msgFilterList = new ArrayList<>();

    public MsgFilterChain add(MsgFilter msgFilter) {
        msgFilterList.add(msgFilter);
        return this;
    }

    @Override
    public boolean doFilter(Message msg) {
        for (MsgFilter msgFilter : msgFilterList) {
            if (!msgFilter.doFilter(msg)) {
                log.info(msgFilter.getClass() + "终止了链条");
                return false;
            }
        }
        return true;
    }
}
