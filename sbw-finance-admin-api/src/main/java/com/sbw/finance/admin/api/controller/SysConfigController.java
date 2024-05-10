package com.sbw.finance.admin.api.controller;

import com.sbw.common.dto.ApiResponse;
import com.sbw.finance.biz.dto.form.SaveSendSmsCodeTemplateConfigForm;
import com.sbw.finance.biz.service.SysConfigService;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Api(tags = "系统配置")
@RestController
@RequestMapping(value = "/sysConfig")
@RequiredArgsConstructor
@Slf4j
@Validated
public class SysConfigController {
    final SysConfigService sysConfigService;

    @ApiOperation(value = "保存短信验证码模板配置")
    @PostMapping(value = "/saveSendSmsCodeTemplateConfig")
    public ApiResponse<Boolean> saveSendSmsCodeTemplateConfig(@Valid @RequestBody SaveSendSmsCodeTemplateConfigForm form) throws JsonProcessingException {
        return ApiResponse.success(sysConfigService.saveSendSmsCodeTemplateConfig(form));
    }
}
