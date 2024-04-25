//package com.sbw.finance.admin.api.controller;
//
//import com.sbw.common.dto.ApiResponse;
//import com.sbw.finance.biz.service.SysRoleBindResourceService;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@Api(tags = "系统角色绑定资源")
//@RestController
//@RequestMapping(value = "/sysRoleBindResource")
//@RequiredArgsConstructor
//@Slf4j
//@Validated
//public class SysRoleBindResourceController {
//    final SysRoleBindResourceService sysRoleBindResourceService;
//
//    @ApiOperation(value = "查询绑定的资源列表")
//    @GetMapping(value = "/listBindResourceIdByRoleId")
//    public ApiResponse<List<Integer>> listBindResourceIdByRoleId(@RequestParam int roleId) {
//        return ApiResponse.success(sysRoleBindResourceService.listBindResourceIdByRoleId(roleId));
//    }
//}
