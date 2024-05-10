package com.sbw.finance.biz.domain;

import java.util.Date;

/**
 * 系统角色绑定菜单（表：sys_role_bind_menu）
 *
 * @author sbw
 */
public class SysRoleBindMenu {
    /**
     * 
     */
    private Integer id;

    /**
     * 角色id
     */
    private Integer sysRoleId;

    /**
     * 系统菜单id
     */
    private Integer sysMenuId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 用户id
     */
    private Long memberId;

    /**
     * 修改用户id
     */
    private Long updateMemberId;

    /**
     * 是否删除，0：删除，1：未删除
     */
    private Boolean delFlag;

    /**
     * 是否禁用
     */
    private Boolean disable;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSysRoleId() {
        return sysRoleId;
    }

    public void setSysRoleId(Integer sysRoleId) {
        this.sysRoleId = sysRoleId;
    }

    public Integer getSysMenuId() {
        return sysMenuId;
    }

    public void setSysMenuId(Integer sysMenuId) {
        this.sysMenuId = sysMenuId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Long getUpdateMemberId() {
        return updateMemberId;
    }

    public void setUpdateMemberId(Long updateMemberId) {
        this.updateMemberId = updateMemberId;
    }

    public Boolean getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Boolean delFlag) {
        this.delFlag = delFlag;
    }

    public Boolean getDisable() {
        return disable;
    }

    public void setDisable(Boolean disable) {
        this.disable = disable;
    }

    public void initDefault() {
        if (this.getSysRoleId() == null) {
            this.setSysRoleId(0);
        }
        if (this.getSysMenuId() == null) {
            this.setSysMenuId(0);
        }
        if (this.getCreateTime() == null) {
            this.setCreateTime(new Date());
        }
        if (this.getUpdateTime() == null) {
            this.setUpdateTime(new Date());
        }
        if (this.getMemberId() == null) {
            this.setMemberId(0L);
        }
        if (this.getUpdateMemberId() == null) {
            this.setUpdateMemberId(0L);
        }
        if (this.getDelFlag() == null) {
            this.setDelFlag(false);
        }
        if (this.getDisable() == null) {
            this.setDisable(false);
        }
    }

    public void initUpdate() {
    }
}