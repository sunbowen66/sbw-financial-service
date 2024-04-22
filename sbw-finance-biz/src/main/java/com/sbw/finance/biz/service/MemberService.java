package com.sbw.finance.biz.service;

import com.sbw.finance.biz.domain.Member;
import com.sbw.finance.biz.dto.form.UpdateEmailAndNameForm;
import com.sbw.finance.biz.dto.vo.ListMemberVo;

import java.util.List;

public interface MemberService {
    /**
     * 注册
     * @param tenantId 租户id
     * @return 会员id
     */
    long reg(long tenantId);

    /**
     * 获取会员信息
     *
     * @param id
     * @return
     */
    Member get(long id);

    /**
     * 修改邮箱和姓名
     * @param form
     * @return
     */
    //boolean updateEmailAndName(UpdateEmailAndNameForm form);

    /**
     * 查询用户列表
     * @return
     */
    //List<ListMemberVo> listMember();
}
