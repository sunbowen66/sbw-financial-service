package com.sbw.finance.biz.dto.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Pattern;
import java.util.Date;

/**
 * 辅助核算部门列表
 */
@Data
public class ListAssistCalculateDepartmentVo extends BaseAssistCalculateVo {

    @ApiModelProperty(value = "负责人")
    private String manager;

    @ApiModelProperty(value = "手机")
    @Pattern(regexp = "^(\\d{11})?$", message = "手机格式不正确")
    private String phone;

    @ApiModelProperty(value = "成立日期")
    private Date startDate;

    @ApiModelProperty(value = "撤销日期")
    private Date revokeDate;
}