//package com.sbw.finance.admin.api.controller;
//
//import com.sbw.common.dto.ApiResponse;
//import com.sbw.finance.biz.dto.form.GetUserSmsCodeForm;
//import com.sbw.finance.biz.dto.form.UpdateEmailAndNameForm;
//import com.sbw.finance.biz.dto.form.UpdatePasswordForm;
//import com.sbw.finance.biz.dto.form.UpdatePhoneForm;
//import com.sbw.finance.biz.dto.vo.CurrentInfoVo;
//import com.sbw.finance.biz.dto.vo.ListMemberVo;
//import com.sbw.finance.biz.service.MemberBindPhoneService;
//import com.sbw.finance.biz.service.MemberComService;
//import com.sbw.finance.biz.service.MemberService;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@Api(tags = "用户模块")
//@RestController
//@RequestMapping(value = "/user")
//@RequiredArgsConstructor
//@Slf4j
//public class UserController {
//    final MemberComService memberComService;
//    final MemberService memberService;
//    final MemberBindPhoneService memberBindPhoneService;
//
//    @ApiOperation(value = "获取当前登录用户信息")
//    @GetMapping(value = "/currentUser")
//    public ApiResponse<CurrentInfoVo> currentUser() {
//        return ApiResponse.success(memberComService.getCurrentInfo());
//    }
//
//    @ApiOperation(value = "修改邮箱和姓名")
//    @PostMapping(value = "/updateEmailAndName")
//    public ApiResponse<Boolean> updateEmailAndName(@Validated @RequestBody UpdateEmailAndNameForm form) {
//        return ApiResponse.success(memberService.updateEmailAndName(form));
//    }
//
//    @ApiOperation(value = "修改密码")
//    @PostMapping(value = "/updatePassword")
//    public ApiResponse<Boolean> updatePassword(@Validated @RequestBody UpdatePasswordForm form) {
//        return ApiResponse.success(memberBindPhoneService.updatePassword(form));
//    }
//
//    @ApiOperation(value = "修改手机号")
//    @PostMapping(value = "/updatePhone")
//    public ApiResponse<Boolean> updatePhone(@Validated @RequestBody UpdatePhoneForm form) {
//        return ApiResponse.success(memberComService.updatePhone(form));
//    }
//
//    @ApiOperation(value = "获取图形验证码")
//    @GetMapping(value = "/getBase64Code")
//    public ApiResponse<String> getBase64Code() {
//        String result = memberComService.getBase64Code();
//        return ApiResponse.success(result);
//    }
//
//    @ApiOperation(value = "获取短信验证码")
//    @GetMapping(value = "/sendSmsCode")
//    public ApiResponse<Void> sendSmsCode(@Validated @ModelAttribute GetUserSmsCodeForm request) {
//        memberComService.sendSmsCode(request);
//        return ApiResponse.success();
//    }
//
//    @ApiOperation(value = "获取用户列表")
//    @GetMapping(value = "/listMember")
//    public ApiResponse<List<ListMemberVo>> listMember() {
//        return ApiResponse.success(memberService.listMember());
//    }
//}
