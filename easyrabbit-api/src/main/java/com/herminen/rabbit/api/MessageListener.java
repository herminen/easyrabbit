package com.herminen.rabbit.api;

import com.herminen.rabbit.entity.MessageContext;

/**
 * Created with IntelliJ IDEA.
 * User: herminen
 * Date: 2021/1/23
 * Time: 18:05
 * Description: No Description
 */
public interface MessageListener {

    void onMessage(MessageContext context);
}
