package top.igio.ps.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import top.igio.ps.entity.CsUser;
import top.igio.ps.entity.request.LoginRequest;
import top.igio.ps.enums.ResultCodeEnum;
import top.igio.ps.exception.ResultVO;
import top.igio.ps.service.CsUserService;
import top.igio.ps.service.UserService;


import javax.annotation.Resource;

/**
 * @author ljl
 * @version V1.0
 * @data 2023/7/23 15:22
 * @description
 */
@Service
public class UserServiceImpl implements UserService {

    private static final  Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Resource
    private CsUserService userService;

    @Override
    public ResultVO<String> verifyUserInfo(LoginRequest request) {
        CsUser userInfo = userService.getOne(new QueryWrapper<CsUser>()
                .eq("user_id",request.getUserId())
                .eq("user_password",request.getUserPassword())
                .eq("is_deleted",0));
        if (userInfo == null) {
            logger.info("用户名或密码错误，请重新输入！");
            return new ResultVO<>(ResultCodeEnum.NO_USER,"用户名或密码错误，请重新输入！");
        }

        return new ResultVO<>(ResultCodeEnum.SUCCESS,"登录成功！");
    }
}
