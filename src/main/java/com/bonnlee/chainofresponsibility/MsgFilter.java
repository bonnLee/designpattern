package com.bonnlee.chainofresponsibility;

public interface MsgFilter {
    boolean doFilter(Message msg);
}
