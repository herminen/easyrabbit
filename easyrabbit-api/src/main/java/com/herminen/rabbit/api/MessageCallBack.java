package com.herminen.rabbit.api;

import com.herminen.rabbit.entity.MessageContext;

/**
 * Created with IntelliJ IDEA.
 * User: herminen
 * Date: 2021/1/23
 * Time: 18:02
 * Description: No Description
 */
public interface MessageCallBack {

    void onSuccess(MessageContext messageContext);

    void onFailure(MessageContext messageContext);
}
