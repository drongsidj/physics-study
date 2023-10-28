package top.igio.ps.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.igio.ps.entity.request.LoginRequest;
import top.igio.ps.exception.ResultVO;
import top.igio.ps.service.UserService;


import javax.servlet.http.HttpServletRequest;

/**
 * @author ljl
 * @version V1.0
 * @data 2023/7/23 15:40
 * @description
 */
@RestController
@RequestMapping("/cs/user")
@Api(value = "用户信息操作", tags = "用户相关服务")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);


    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @ApiOperation("验证登录信息")
    @PostMapping(value = "/login", name = "验证登录信息")
    //@RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResultVO<String> verifyUserInfo(@RequestBody LoginRequest request, HttpServletRequest httpServletRequest) {
        logger.info("验证登录信息");
        return userService.verifyUserInfo(request);
    }

    @GetMapping(value = "/testGetMapping")
    public String testGetMapping() {
        return "testGetMapping";
    }

    @RequestMapping(value = "/testRequestMapping",method = RequestMethod.POST)
    public String testRequestMapping() {
        return "testRequestMapping";
    }
}
