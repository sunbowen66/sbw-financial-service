package com.sbw.finance.biz.domain;

import java.util.Date;

/**
 * 辅助核算项目表（表：assist_calculate_project）
 *
 * @author sbw
 */
public class AssistCalculateProject {
    /**
     * 
     */
    private Long id;

    /**
     * 负责部门
     */
    private String responsibleDepartment;

    /**
     * 责任人
     */
    private String responsiblePerson;

    /**
     * 手机
     */
    private String phone;

    /**
     * 开始日期
     */
    private Date startDate;

    /**
     * 结束日期
     */
    private Date endDate;

    /**
     * 是否禁用
     */
    private Boolean disable;

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
     * 租户id
     */
    private Long tenantId;

    /**
     * 辅助核算id
     */
    private Long assistCalculateSummaryId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getResponsibleDepartment() {
        return responsibleDepartment;
    }

    public void setResponsibleDepartment(String responsibleDepartment) {
        this.responsibleDepartment = responsibleDepartment;
    }

    public String getResponsiblePerson() {
        return responsiblePerson;
    }

    public void setResponsiblePerson(String responsiblePerson) {
        this.responsiblePerson = responsiblePerson;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Boolean getDisable() {
        return disable;
    }

    public void setDisable(Boolean disable) {
        this.disable = disable;
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

    public Long getTenantId() {
        return tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getAssistCalculateSummaryId() {
        return assistCalculateSummaryId;
    }

    public void setAssistCalculateSummaryId(Long assistCalculateSummaryId) {
        this.assistCalculateSummaryId = assistCalculateSummaryId;
    }

    public void initDefault() {
        if (this.getResponsibleDepartment() == null) {
            this.setResponsibleDepartment("");
        }
        if (this.getResponsiblePerson() == null) {
            this.setResponsiblePerson("");
        }
        if (this.getPhone() == null) {
            this.setPhone("");
        }
        if (this.getDisable() == null) {
            this.setDisable(false);
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
        if (this.getTenantId() == null) {
            this.setTenantId(0L);
        }
        if (this.getAssistCalculateSummaryId() == null) {
            this.setAssistCalculateSummaryId(0L);
        }
    }

    public void initUpdate() {
    }
}