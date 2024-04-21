package com.sbw.finance.biz.dto.form;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
public class PhoneSmsCodeLoginForm {
    @ApiModelProperty(value = "手机号")
    @NotBlank(message = "手机号不能为空")
    @Pattern(regexp = "^1\\d{10}$",message = "手机号格式错误！")
    private String phone;

    @ApiModelProperty(value = "短信验证码")
    @NotBlank(message = "请输入短信验证码")
    @Pattern(regexp = "^[0-9]{6}$",message = "短信验证码格式不正确")
    private String smsCode;
}
