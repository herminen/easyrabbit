package com.herminen.rabbit.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: herminen
 * Date: 2021/1/23
 * Time: 18:03
 * Description: No Description
 */
@Data
public class MessageContext implements Serializable {
    private static final long serialVersionUID = 8492127012320797336L;

    private Message message;

    private String cause;
}
