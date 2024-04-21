package com.sbw.finance.biz.service;

import com.sbw.finance.biz.dto.vo.DataDictionaryVo;

import java.util.List;

public interface DataDictionaryService {
    /**
     * 查看行业数据字典列表
     * @return
     */
    List<DataDictionaryVo> listHangYe();

    /**
     * 查看会计准则数据字典列表
     * @return
     */
    List<DataDictionaryVo> listKuaiJiZhunZe();
}
