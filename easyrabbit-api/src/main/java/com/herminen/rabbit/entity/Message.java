package com.herminen.rabbit.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: herminen
 * Date: 2021/1/23
 * Time: 16:07
 * Description: No Description
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Message implements Serializable {
    private static final long serialVersionUID = 7175637784318064873L;

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
    private String messageType = MessageType.CONFIRM.getType();
}
