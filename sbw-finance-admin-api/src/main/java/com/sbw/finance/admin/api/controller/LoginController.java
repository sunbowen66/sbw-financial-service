package com.sbw.finance.admin.api.controller;

import com.sbw.common.dto.ApiResponse;
import com.sbw.common.dto.TokenResponse;
import com.sbw.finance.biz.dto.form.*;
import com.sbw.finance.biz.service.MemberLoginService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @Description 登录相关
 * @ProjectName sbw-parent
 * @ClassName LoginController
 * @Date 2024/4/19 20:32
 * @Created By 孙博文
 * @Version 1.0.0
 */
@Api(tags = "用户登录模块")
@RestController
@RequestMapping(value = "/login")
@RequiredArgsConstructor
@Slf4j
public class LoginController {

    final MemberLoginService memberLoginService;

    @ApiOperation(value = "获取客户端id")
    @GetMapping(value = "/getClientId")
    public ApiResponse<String> getClientId() {

        String clientId = memberLoginService.getClientId();
        return ApiResponse.success(clientId);
    }

    @ApiOperation(value = "获取图形验证码")
    @GetMapping(value = "/getBase64Code")
    public ApiResponse<String> getBase64Code(@Validated @ModelAttribute GetBase64CodeForm form) {

        String base64Code = memberLoginService.getBase64Code(form);
        return ApiResponse.success(base64Code);
    }


    @ApiOperation(value = "获取短信验证码")
    @GetMapping(value = "/sendSmsCode")
    public ApiResponse<Void> sendSmsCode(@Validated @ModelAttribute GetSmsCodeForm form) {
        memberLoginService.sendSmsCode(form);
        return ApiResponse.success();
    }

    @ApiOperation(value = "手机密码登录")
    @PostMapping(value = "/phonePasswordLogin")
    public ApiResponse<TokenResponse> phonePasswordLogin(@Validated @RequestBody PhonePasswordLoginForm form) {
        TokenResponse tokenResponse = memberLoginService.phonePasswordLogin(form);
        return ApiResponse.success(tokenResponse);
    }

    @ApiOperation(value = "手机短信登录")
    @PostMapping(value = "/phoneSmsCodeLogin")
    public ApiResponse<TokenResponse> phoneSmsCodeLogin(@Validated @RequestBody PhoneSmsCodeLoginForm request) {
        TokenResponse tokenResponse = memberLoginService.phoneSmsCodeLogin(request);
        return ApiResponse.success(tokenResponse);
    }

//    @ApiOperation(value = "获取客户端token")
//    @GetMapping(value = "/getClientToken")
//    public ApiResponse<TokenResponse> getClientToken(@Validated @ModelAttribute GetClientTokenForm request) {
//        TokenResponse result = memberLoginService.getClientToken(request.getClientId());
//        return ApiResponse.success(result);
//    }
}
