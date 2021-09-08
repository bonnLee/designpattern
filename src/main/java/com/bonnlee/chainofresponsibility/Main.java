package com.bonnlee.chainofresponsibility;

public class Main {
    /*
    已一条消息中含有敏感信息和可能对前端页面等有影响的词语过滤
     */
    public static void main(String[] args) {
        Message msg = new Message();
        String content = "<script>:),1523333今天是小日本灭亡第6天，可我还是996的干活";
        msg.setContent(content);
//        removeSensitiveContent(msg);
//        System.out.println(msg.getContent());

        MsgFilterChain msgFilterChain1 = new MsgFilterChain();
        msgFilterChain1.add(new HTMLFilter()).add(new SensitiveWordFilter());

        MsgFilterChain msgFilterChain2 = new MsgFilterChain();
        msgFilterChain2.add(new NumberFilter()).add(new SmileFilter());

        msgFilterChain1.add(msgFilterChain2).doFilter(msg);
        System.out.println(msg);
    }

    /*
    责任链模式旨在解耦，不同的类做不同的事，但可以将整个处理流程给串通
     */
    private static String removeSensitiveContent(Message msg){
        String from = msg.getContent();
        from = from.replace("<","[");
        from = from.replace(">","]");
        from = from.replace(":)","^_^");
        from = from.replace("小日本","米西米西");
        from = from.replace("996","被剥削式");
        msg.setContent(from);
        return from;
    }
}
