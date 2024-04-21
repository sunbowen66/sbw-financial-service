package com.sbw.finance.admin.api.controller;

import com.sbw.common.dto.ApiResponse;
import com.sbw.finance.biz.dto.form.GetBase64CodeForm;
import com.sbw.finance.biz.dto.form.GetSmsCodeForm;
import com.sbw.finance.biz.service.MemberLoginService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
