package com.peacock.website.frontend.exceptions;

/**
 * @Author: kelvin
 * @Description
 * @Date: created in 下午6:06 2018/7/1
 * @Modified By:
 **/
public class PeacockException extends RuntimeException {
    public PeacockException() {
        super();
    }

    public PeacockException(String message) {
        super(message);
    }

    public PeacockException(String message, Throwable cause) {
        super(message, cause);
    }

    public PeacockException(Throwable cause) {
        super(cause);
    }

    protected PeacockException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
