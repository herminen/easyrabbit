package com.herminen.rabbit.com.herminen.rabbit.exception;

/**
 * Created with IntelliJ IDEA.
 * User: herminen
 * Date: 2021/1/23
 * Time: 16:36
 * Description: No Description
 */
public class BaseEasyRabbitException extends Exception {
    private static final long serialVersionUID = -7866272697058531111L;

    public BaseEasyRabbitException() {
        super();
    }

    public BaseEasyRabbitException(String message){
        super(message);
    }

    public BaseEasyRabbitException(String message, Throwable throwable){
        super(message, throwable);
    }

    public BaseEasyRabbitException(Throwable throwable){
        super(throwable);
    }
}
