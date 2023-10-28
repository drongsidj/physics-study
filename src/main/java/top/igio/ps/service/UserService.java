package top.igio.ps.service;


import top.igio.ps.entity.request.LoginRequest;
import top.igio.ps.exception.ResultVO;

/**
 * @author ljl
 * @version V1.0
 * @data 2023/7/23 15:21
 * @description
 */
public interface UserService {

    ResultVO<String> verifyUserInfo(LoginRequest request);
}
