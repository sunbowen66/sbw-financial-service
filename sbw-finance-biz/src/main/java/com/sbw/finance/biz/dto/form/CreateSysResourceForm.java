package com.sbw.finance.biz.dto.form;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * 创建资源
 */
@Data
public class CreateSysResourceForm {
    @ApiModelProperty(value = "上级资源id")
    @NotNull
    @Range(min = 0,max = Integer.MAX_VALUE)
    private Integer pid;

    @ApiModelProperty(value = "资源名称")
    @NotBlank
    @Size(min = 1,max = 50)
    private String name;

    @ApiModelProperty(value = "资源路径")
    @NotBlank
    @Size(min = 1,max = 50)
    private String path;
}
