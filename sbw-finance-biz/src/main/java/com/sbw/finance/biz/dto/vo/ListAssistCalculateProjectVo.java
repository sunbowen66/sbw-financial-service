package com.sbw.finance.biz.dto.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * 辅助核算项目列表
 *
 */
@Data
public class ListAssistCalculateProjectVo extends BaseAssistCalculateVo {
    @ApiModelProperty(value = "负责部门")
    private String responsibleDepartment;

    @ApiModelProperty(value = "责任人")
    private String responsiblePerson;

    @ApiModelProperty(value = "手机")
    private String phone;

    @ApiModelProperty(value = "开始日期")
    private Date startDate;

    @ApiModelProperty(value = "结束日期")
    private Date endDate;
}