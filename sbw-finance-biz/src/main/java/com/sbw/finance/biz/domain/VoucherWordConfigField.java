package com.sbw.finance.biz.domain;

import com.sbw.mybatis.help.DbField;
import com.sbw.mybatis.help.FieldResult;
import java.util.Collections;

public class VoucherWordConfigField {
    public static DbField Id = new DbField("id","id","BIGINT","java.lang.Long");

    public static DbField VoucherWord = new DbField("voucher_word","voucherWord","VARCHAR","java.lang.String");

    public static DbField PrintTitle = new DbField("print_title","printTitle","VARCHAR","java.lang.String");

    public static DbField DefaultFlag = new DbField("default_flag","defaultFlag","BIT","java.lang.Boolean");

    public static DbField TenantId = new DbField("tenant_id","tenantId","BIGINT","java.lang.Long");

    public static DbField Disable = new DbField("disable","disable","BIT","java.lang.Boolean");

    public static DbField CreateTime = new DbField("create_time","createTime","TIMESTAMP","java.util.Date");

    public static DbField UpdateTime = new DbField("update_time","updateTime","TIMESTAMP","java.util.Date");

    public static DbField MemberId = new DbField("member_id","memberId","BIGINT","java.lang.Long");

    public static DbField UpdateMemberId = new DbField("update_member_id","updateMemberId","BIGINT","java.lang.Long");

    public static DbField DelFlag = new DbField("del_flag","delFlag","BIT","java.lang.Boolean");

    public static DbField UseCount = new DbField("use_count","useCount","INTEGER","java.lang.Integer");

    public static FieldResult setId(Long id) {
        return new FieldResult(Id, Collections.singletonList(id));
    }

    public static FieldResult setVoucherWord(String voucherWord) {
        return new FieldResult(VoucherWord, Collections.singletonList(voucherWord));
    }

    public static FieldResult setPrintTitle(String printTitle) {
        return new FieldResult(PrintTitle, Collections.singletonList(printTitle));
    }

    public static FieldResult setDefaultFlag(Boolean defaultFlag) {
        return new FieldResult(DefaultFlag, Collections.singletonList(defaultFlag));
    }

    public static FieldResult setTenantId(Long tenantId) {
        return new FieldResult(TenantId, Collections.singletonList(tenantId));
    }

    public static FieldResult setDisable(Boolean disable) {
        return new FieldResult(Disable, Collections.singletonList(disable));
    }

    public static FieldResult setCreateTime(java.util.Date createTime) {
        return new FieldResult(CreateTime, Collections.singletonList(createTime));
    }

    public static FieldResult setUpdateTime(java.util.Date updateTime) {
        return new FieldResult(UpdateTime, Collections.singletonList(updateTime));
    }

    public static FieldResult setMemberId(Long memberId) {
        return new FieldResult(MemberId, Collections.singletonList(memberId));
    }

    public static FieldResult setUpdateMemberId(Long updateMemberId) {
        return new FieldResult(UpdateMemberId, Collections.singletonList(updateMemberId));
    }

    public static FieldResult setDelFlag(Boolean delFlag) {
        return new FieldResult(DelFlag, Collections.singletonList(delFlag));
    }

    public static FieldResult setUseCount(Integer useCount) {
        return new FieldResult(UseCount, Collections.singletonList(useCount));
    }
}