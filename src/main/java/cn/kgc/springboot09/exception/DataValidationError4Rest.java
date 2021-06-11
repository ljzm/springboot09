package cn.kgc.springboot09.exception;

import lombok.Getter;
import org.springframework.validation.BindingResult;

public class DataValidationError4Rest extends RuntimeException {

    @Getter
    private BindingResult bindingResult;

    public DataValidationError4Rest(BindingResult bindingResult) {
        this.bindingResult = bindingResult;
    }


    public DataValidationError4Rest() {
    }

    public DataValidationError4Rest(String message) {
        super(message);
    }

    public DataValidationError4Rest(String message, Throwable cause) {
        super(message, cause);
    }

    public DataValidationError4Rest(Throwable cause) {
        super(cause);
    }

    public DataValidationError4Rest(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
