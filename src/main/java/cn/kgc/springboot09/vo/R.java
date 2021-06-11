package cn.kgc.springboot09.vo;

public class R {
    private String message;
    private boolean success;
    private Object data;
    private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    private R(String message, boolean success, Object data) {
        this.message = message;
        this.success = success;
        this.data = data;
    }

    public static R success() {
        return new R(null, true, null);
    }

    public static R success(String message) {
        return new R(message, true, null);
    }

    public static R success(String message, Object data) {
        return new R(message, true, data);
    }

    public static R success(Object data) {
        return new R(null, true, data);
    }

    public static R fail() {
        return new R(null, false, null);
    }

    public static R fail(String message) {
        return new R(message, false, null);
    }

    public static R fail(String message, Object data) {
        return new R(message, false, data);
    }

    public static R fail(Object data) {
        return new R(null, false, data);
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
