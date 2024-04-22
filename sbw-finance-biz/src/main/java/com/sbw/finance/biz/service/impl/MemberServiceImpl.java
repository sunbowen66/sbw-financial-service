package com.sbw.finance.biz.service.impl;


import com.sbw.common.constant.CommonConstant;
import com.sbw.finance.biz.domain.Member;
import com.sbw.finance.biz.dto.form.UpdateEmailAndNameForm;
import com.sbw.finance.biz.dto.vo.ListMemberVo;
import com.sbw.finance.biz.mapper.MemberMapper;
import com.sbw.finance.biz.service.MemberService;
import com.sbw.mybatis.help.MyBatisWrapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.sbw.finance.biz.domain.MemberField.*;

@Service
@Slf4j
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {
    final MemberMapper memberMapper;
    //final TokenService<AdminDTO> tokenService;
    //final ObjectConvertor objectConvertor;

    /**
     * 注册
     *
     * @param tenantId 租户id
     * @return 会员id
     */
    @Override
    public long reg(long tenantId) {
        System.out.println("------------------");
        System.out.println(tenantId);
        Member member = new Member();
        member.setTenantId(tenantId);
        member.setSysRoleIds("[" + CommonConstant.ROLE_MEMBER + "]");
        member.initDefault();
        memberMapper.insert(member);
        return member.getId();
    }

    /**
     * 获取会员信息
     *
     * @param id
     * @return
     */
    @Override
    public Member get(long id) {
        MyBatisWrapper<Member> myBatisWrapper = new MyBatisWrapper<>();
        myBatisWrapper.select(NickName, Id, Disable, Name, AvatarUrl, SysRoleIds,
                TenantId, Email)
                .whereBuilder().andEq(setId(id));
        return memberMapper.topOne(myBatisWrapper);
    }

    /**
     * 修改邮箱和姓名
     *
     * @param form
     * @return
     */
//    @Override
//    public boolean updateEmailAndName(UpdateEmailAndNameForm form) {
//        MyBatisWrapper<Member> wrapper = new MyBatisWrapper<>();
//        wrapper.update(setEmail(form.getEmail()))
//                .update(setName(form.getName()))
//                .whereBuilder()
//                .andEq(setId(tokenService.getThreadLocalUserId()))
//                .andEq(setDisable(false));
//        return memberMapper.updateField(wrapper) > 0;
//    }

    /**
     * 查询用户列表
     *
     * @return
     */
//    @Override
//    public List<ListMemberVo> listMember() {
//        MyBatisWrapper<Member> wrapper = new MyBatisWrapper<>();
//        wrapper.select(Id, NickName, Name)
//                .whereBuilder()
//                .andEq(TenantId, tokenService.getThreadLocalTenantId())
//                .andEq(Disable, false);
//        List<Member> members = memberMapper.list(wrapper);
//        return objectConvertor.toListMemberVo(members);
//    }
}
