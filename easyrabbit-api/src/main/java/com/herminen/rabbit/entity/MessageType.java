package com.herminen.rabbit.entity;

/**
 * Created with IntelliJ IDEA.
 * User: liuhai
 * Date: 2021/1/23
 * Time: 16:12
 * Description: No Description
 */
public enum MessageType {
    /**
     * 迅速消息  不需要保证消息可靠性，不需要confirm
     */
    RAPID("rapid"),
    /**
     * 确认消息  不需要保证消息的可靠性，会做消息confirm
     */
    CONFIRM("confirm"),
    /**
     * 可靠消息  保证消息可靠性投递，不允许消息丢失
     */
    RELIABLE("reliabke"),
    /**
     * 延迟消息
     */
    DELAY("delay"),
    ;

    private String type;

    MessageType(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
