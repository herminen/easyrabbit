package com.herminen.rabbit.api;

import com.herminen.rabbit.com.herminen.rabbit.exception.BaseEasyRabbitRunTimeException;
import com.herminen.rabbit.entity.Message;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: liuhai
 * Date: 2021/1/23
 * Time: 18:00
 * Description: No Description
 */
public interface MessageProducer {

    /**
     * 发送消息
     * @param message
     * @throws BaseEasyRabbitRunTimeException
     */
    void send(Message message) throws BaseEasyRabbitRunTimeException;

    /**
     * 批量发送消息
     * @param messages
     * @throws BaseEasyRabbitRunTimeException
     */
    void send(List<Message> messages) throws BaseEasyRabbitRunTimeException;

    void send(Message message, MessageCallBack messageCallBack);
}
