package com.sbw.finance.biz.dto.form;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 辅助核算（自定义）
 *
 */
@Data
public class CreateAssistCalculateCustomForm extends CreateAssistCalculateForm {

    /**
     * 自定义字段1
     */
    @ApiModelProperty(value = "自定义字段1")
    private String c1;

    /**
     * 自定义字段2
     */
    @ApiModelProperty(value = "自定义字段2")
    private String c2;

    /**
     * 自定义字段3
     */
    @ApiModelProperty(value = "自定义字段3")
    private String c3;

    /**
     * 自定义字段4
     */
    @ApiModelProperty(value = "自定义字段4")
    private String c4;

    /**
     * 自定义字段5
     */
    @ApiModelProperty(value = "自定义字段5")
    private String c5;

    /**
     * 自定义字段6
     */
    @ApiModelProperty(value = "自定义字段6")
    private String c6;

    /**
     * 自定义字段7
     */
    @ApiModelProperty(value = "自定义字段7")
    private String c7;

    /**
     * 自定义字段8
     */
    @ApiModelProperty(value = "自定义字段8")
    private String c8;

    /**
     * 自定义字段9
     */
    @ApiModelProperty(value = "自定义字段9")
    private String c9;
}