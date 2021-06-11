package cn.kgc.springboot09.exception;

public class LoginSuccessException extends Exception {
    public LoginSuccessException() {
    }

    public LoginSuccessException(String message) {
        super(message);
    }

    public LoginSuccessException(String message, Throwable cause) {
        super(message, cause);
    }

    public LoginSuccessException(Throwable cause) {
        super(cause);
    }

    public LoginSuccessException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
