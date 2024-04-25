package com.sbw.finance.admin.api.controller;

import com.sbw.common.dto.ApiResponse;
import com.sbw.finance.biz.dto.form.GenerateMpRegCodeForm;
import com.sbw.finance.biz.dto.form.PhoneRegisterForm;
import com.sbw.finance.biz.dto.vo.GenerateMpRegCodeVo;
import com.sbw.finance.biz.service.MemberRegService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Api(tags = "注册模块")
@RestController
@RequestMapping(value = "/reg")
@RequiredArgsConstructor
@Slf4j
public class RegController {
    final MemberRegService memberRegService;

    @ApiOperation(value = "手机号注册")
    @PostMapping(value = "/phoneReg")
    public ApiResponse<Long> phoneReg(@Validated @RequestBody PhoneRegisterForm form) {
        return ApiResponse.success(memberRegService.phoneReg(form));
    }

    @ApiOperation(value = "生成微信公众号二维码（关注注册）")
    @GetMapping(value = "/generateMpRegCode")
    public ApiResponse<GenerateMpRegCodeVo> generateMpRegCode(@Validated @ModelAttribute GenerateMpRegCodeForm request) {
        GenerateMpRegCodeVo result = memberRegService.generateMpRegCode(request.getClientId());
        return ApiResponse.success(result);
    }
}
