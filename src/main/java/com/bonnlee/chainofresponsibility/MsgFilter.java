package com.bonnlee.chainofresponsibility;

public interface MsgFilter {
    Message doFilter(Message msg);
}
