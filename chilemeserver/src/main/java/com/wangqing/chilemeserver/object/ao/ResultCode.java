package com.wangqing.chilemeserver.object.ao;

/**
 * 自定义返回结果码
 */
public enum ResultCode {
    /* 成功 */
    SUCCESS(1, "成功！"),
    LOG_OUT_SUCCESS(2, "注销成功"),
    /* 参数错误： 1001-1999 */
    PARAM_IS_INVALID(1001,"参数无效"),
    PARAM_IS_BLANK(1002, "参数为空"),
    PARAM_TYPE_BIND_ERROR(1003, "参数类型错误"),
    PARAM_NOT_COMPLETE(1004, "参数缺失"),
    /* 用户错误：2001-2009 */
    USER_NOT_LOGGED_IN(2001, "用户未登录，访问的路径需要验证，请登录"),
    USER_LOGIN_ERROR(2002, "账号不存在或密码错误"),
    USER_ACCOUNT_FORBIDDEN(2003, "账号已被禁用"),
    USER_NOT_EXIST(2004, "用户不存在"),
    USER_HAS_EXITED(2005, "用户已存在"),
    /* 系统错误 */
    LOG_OUT_ERROR(5001, "注销失败");

    private Integer code;
    private String message;

    ResultCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer code() {
        return this.code;
    }

    public String message() {
        return this.message;
    }
}
