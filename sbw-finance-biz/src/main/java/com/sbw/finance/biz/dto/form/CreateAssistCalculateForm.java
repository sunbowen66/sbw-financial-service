package com.sbw.finance.biz.dto.form;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * 辅助核算（基类，通用字段）
 *
 */
@Data
public class CreateAssistCalculateForm {
    @ApiModelProperty(value = "辅助核算类别id")
    @NotNull
    @Range(min = 1, max = Long.MAX_VALUE)
    private Long assistCalculateCateId;
    /**
     * 编码
     */
    @NotBlank
    @ApiModelProperty(value = "客户编码/供应商编码/职员编码/部门编码/项目编码/存货编码/现金流编码/编码")
    private String code;

    /**
     * 辅助核算类别名称
     */
    @NotBlank
    @ApiModelProperty(value = "客户名称/供应商名称/职员名称/部门名称/项目名称/存货名称/现金流名称/名称")
    private String name;

    /**
     * 备注
     */
    @ApiModelProperty(value = "备注")
    private String notes;

    /**
     * 是否禁用
     */
    @ApiModelProperty(value = "是否禁用,true禁用，false启用")
    private Boolean disable;

    @ApiModelProperty(value = "客户类别编码")
    private String customerCate;

    @ApiModelProperty(value = "辅助核算汇总表id（前端不需要传）")
    private Long assistCalculateSummaryId;
}