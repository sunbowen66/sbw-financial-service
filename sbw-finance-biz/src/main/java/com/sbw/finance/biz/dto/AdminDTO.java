package com.sbw.finance.biz.dto;

import com.sbw.common.dto.BaseUserInfoDTO;
import lombok.Data;

import java.util.List;

@Data
public class AdminDTO extends BaseUserInfoDTO {
    private List<Integer> permissions;
}
