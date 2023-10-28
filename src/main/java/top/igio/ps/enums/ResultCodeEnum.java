package top.igio.ps.enums;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @author ljl
 * @version V1.0
 * @data 2023/7/23 15:24
 * @description 返回值枚举类
 */
@Getter
@AllArgsConstructor
public enum ResultCodeEnum {

    /**
     * 成功
     */
    SUCCESS(200,"请求响应成功"),
    /**
     * 请求有误
     */
    PARAM_ERROR(404,"输入有误，系统无法获取资源"),
    /**
     * 服务器异常
     */
    SYSTEM_ERROR (500,"服务器出现异常，请您稍后再试或联系管理员！"),
    /**
     * 未知错误
     */
    UNKNOWN_ERROR(999,"未知异常"),

    NO_USER(1000,"用户不存在"),

    PASSWORD_INCORRECT(1001,"密码错误");

    /**
     * 返回状态码
     */
    private final int code;

    /**
     * 返回类型中文描述
     */
    private final String message;

}
