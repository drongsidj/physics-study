package top.igio.ps.entity.request;

import lombok.Data;

/**
 * @author ljl
 * @version V1.0
 * @data 2023/7/23 15:45
 * @description
 */
@Data
public class LoginRequest {

    private String userId;

    private String userPassword;
}
