package com.sbw.finance.biz.domain;

import com.sbw.mybatis.help.FieldResult;
import com.sbw.mybatis.help.DbField;
import java.util.Collections;

public class MemberBindWxUnionIdField {
    public static com.sbw.mybatis.help.DbField Id = new DbField("id","id","BIGINT","java.lang.Long");

    public static com.sbw.mybatis.help.DbField UnionId = new DbField("union_id","unionId","VARCHAR","java.lang.String");

    public static com.sbw.mybatis.help.DbField MemberId = new DbField("member_id","memberId","BIGINT","java.lang.Long");

    public static com.sbw.mybatis.help.DbField Disable = new DbField("disable","disable","BIT","java.lang.Boolean");

    public static com.sbw.mybatis.help.DbField CreateTime = new DbField("create_time","createTime","TIMESTAMP","java.util.Date");

    public static com.sbw.mybatis.help.DbField UpdateTime = new DbField("update_time","updateTime","TIMESTAMP","java.util.Date");

    public static FieldResult setId(Long id) {
        return new FieldResult(Id, Collections.singletonList(id));
    }

    public static FieldResult setUnionId(String unionId) {
        return new FieldResult(UnionId, Collections.singletonList(unionId));
    }

    public static FieldResult setMemberId(Long memberId) {
        return new FieldResult(MemberId, Collections.singletonList(memberId));
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
}