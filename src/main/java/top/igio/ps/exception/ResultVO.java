package top.igio.ps.exception;

import lombok.*;
import top.igio.ps.enums.ResultCodeEnum;

/**
 * @author ljl
 * @version V1.0
 * @data 2023/7/23 15:19
 * @description
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ResultVO<T> {

    private int code;
    private String msg;
    private T data;

    public ResultVO(ResultCodeEnum resultCodeEnum, T data) {
        this(resultCodeEnum.getCode(), resultCodeEnum.getMessage(), data);
    }
}
