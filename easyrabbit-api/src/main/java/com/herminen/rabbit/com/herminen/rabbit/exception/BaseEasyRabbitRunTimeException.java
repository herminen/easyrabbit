package com.herminen.rabbit.com.herminen.rabbit.exception;

/**
 * Created with IntelliJ IDEA.
 * User: herminen
 * Date: 2021/1/23
 * Time: 16:39
 * Description: No Description
 */
public class BaseEasyRabbitRunTimeException extends RuntimeException {
    private static final long serialVersionUID = -7172742059667799916L;

    public BaseEasyRabbitRunTimeException() {
        super();
    }

    public BaseEasyRabbitRunTimeException(String message){
        super(message);
    }

    public BaseEasyRabbitRunTimeException(String message, Throwable throwable){
        super(message, throwable);
    }

    public BaseEasyRabbitRunTimeException(Throwable throwable){
        super(throwable);
    }
}
