package com.herminen.rabbit.entity;

import com.herminen.rabbit.com.herminen.rabbit.exception.BaseEasyRabbitException;
import com.herminen.rabbit.com.herminen.rabbit.exception.BaseEasyRabbitRunTimeException;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import static com.herminen.rabbit.entity.MessageType.CONFIRM;

/**
 * Created with IntelliJ IDEA.
 * User: liuhai
 * Date: 2021/1/23
 * Time: 16:18
 * Description: No Description
 */
public class MessageBuilder {

    /**
     * 消息唯一id
     */
    private String messageId;

    /**
     * 消息主题
     */
    private String topic;

    /**
     * 消息的路由规则
     */
    private String routingKey;

    /**
     * 消息的附加属性
     */
    private Map<String, Object> attr = new HashMap<>();

    /**
     * 延迟消息延迟时间（毫秒）
     */
    private Integer delayMillseconds;

    /**
     * 消息类型
     */
    private String messageType = CONFIRM.getType();

    private MessageBuilder(){

    }

    public static MessageBuilder getInstance(){
        return new MessageBuilder();
    }

    public MessageBuilder withRoutingKey(String routingKey){
        this.messageId = routingKey;
        return this;
    }

    public MessageBuilder withTopic(String topic){
        this.topic = topic;
        return this;
    }

    public MessageBuilder withAttr(Map<String, Object> attr){
        this.attr = attr;
        return this;
    }

    public MessageBuilder withDelayMillseconds(Integer delayMillseconds){
        this.delayMillseconds = delayMillseconds;
        return this;
    }

    public MessageBuilder withMessageType(String messageType){
        this.messageType = messageType;
        return this;
    }

    public Message build() {
        if(null == messageId){
            messageId = UUID.randomUUID().toString();
        }

        if(null == topic){
            throw new BaseEasyRabbitRunTimeException("topic is empty.");
        }

        return new Message(messageId, topic, routingKey, attr, delayMillseconds, messageType);
    }
}
