package com.sbw.finance.biz.mapper;

import com.sbw.finance.biz.domain.MqMsg;
import com.sbw.mybatis.help.CommonMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MqMsgMapper extends CommonMapper<MqMsg> {
}