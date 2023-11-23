package com.lijinchao.enums;

public enum GlobalEnum {

    /**
     * 状态
     */
    EFFECT("1000", "生效"),
    INVALID("1100", "失效"),

    /**
     * 角色
     */
    SYS_ADMINISTRATOR("1014", "系统管理员"),
    ORDINARY_USER("1022", "普通用户"),
    ;







    String code;

    String message;

    GlobalEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
