package com.paas.model.fss.cav.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class FsCavBill implements Serializable {
    /**
     * 标识
     */
    private String id;

    /**
     * 公司代码
     */
    private String companyCode;

    /**
     * 处理类型  0200：普通下单  0400：冲销
     */
    private String tradeCode;

    /**
     * 单据来源; 【参考字典表的值 BILL_SOURCE】
     */
    private String billSource;

    /**
     * 单据号
     */
    private String billCode;

    /**
     * 单据类型编码【参考字典表的值 BILL_CATEGORY】
     */
    private String billTypeCode;

    /**
     * 单据类型名称
     */
    private String billTypeName;

    /**
     * 单据日期
     */
    private Date billDate;

    /**
     * 单据总金额(含税)，单位：分
     */
    private BigDecimal taxTotalMoney;

    /**
     * 单据总金额(不含税)，单位：分
     */
    private BigDecimal notaxTotalMoney;

    /**
     * 税金，单位：分
     */
    private BigDecimal taxMoney;

    /**
     * 已核销总金额，单位：分
     */
    private BigDecimal verifiedTotalMoney;

    /**
     * 未核销总金额，单位：分
     */
    private BigDecimal noverifyTotalMoney;

    /**
     * 经办人编码
     */
    private String operatorCode;

    /**
     * 经办人名称
     */
    private String operatorName;

    /**
     * 经办部门编码
     */
    private String operatorDepartCode;

    /**
     * 经办部门名称
     */
    private String operatorDepartName;

    /**
     * 备注
     */
    private String remark;

    /**
     * 业务类型编码
     */
    private String busiTypeCode;

    /**
     * 业务类型名称
     */
    private String busiTypeName;

    /**
     * 支付类型编码
     */
    private String payTypeCode;

    /**
     * 支付类型名称
     */
    private String payTypeName;

    /**
     * sap凭证字号
     */
    private String sapVoucherNum;

    /**
     * 记账结果（标识）  0：未记帐 1: 记帐成功：2:记账中  3: 记帐失败  【参考字典表的值 CAV_SAP_ACCOUNT_STATUS】
     */
    private String sapAccountStatus;

    /**
     * 过账日期
     */
    private Date accountDate;

    /**
     * 复核人编码
     */
    private String reviewerCode;

    /**
     * 复核人名称
     */
    private String reviewer;

    /**
     * 复核时间
     */
    private Date reviewDate;

    /**
     * 复核状态  0: 未复核 1：已复核  .  【参考字典表的值 CAV_REVIEW_STATUS】
     */
    private String reviewStauts;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 核销状态  0：未核销  1：已核销  2：部分核销 。【参考字典表的值 CAV_STATUS】
     */
    private String cavStatus;

    /**
     * 是否硬核销【N：否  , Y：是】【参考字典表的值 CAV_FORCE_STATUS】
     */
    private String isForceCav;

    /**
     * 原单据号
     */
    private String srcBillCode;

    /**
     * 是否冲销【0：未冲销  , 1：已冲销， 2：冲销中】   【参考字典表的值 BILL_REV_STAT】
     */
    private String isRevCav;

    /**
     * 是否已经回送接入系统【N：否  , Y：是】
     */
    private String isBackExtsys;

    /**
     * 是否带有核销关联单据【N：否  , Y：是】
     */
    private String isWithCavbill;

    /**
     * 是否已经完成自动核销【N：否  , Y：是】
     */
    private String isCompleteAutocav;

    /**
     * 附件数
     */
    private BigDecimal attachmentCount;

    /**
     * FS_CAV_BILL
     */
    private static final long serialVersionUID = 1L;

    /**
     * 标识
     * @return ID 标识
     */
    public String getId() {
        return id;
    }

    /**
     * 标识
     * @param id 标识
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 公司代码
     * @return COMPANY_CODE 公司代码
     */
    public String getCompanyCode() {
        return companyCode;
    }

    /**
     * 公司代码
     * @param companyCode 公司代码
     */
    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode == null ? null : companyCode.trim();
    }

    /**
     * 处理类型  0200：普通下单  0400：冲销
     * @return TRADE_CODE 处理类型  0200：普通下单  0400：冲销
     */
    public String getTradeCode() {
        return tradeCode;
    }

    /**
     * 处理类型  0200：普通下单  0400：冲销
     * @param tradeCode 处理类型  0200：普通下单  0400：冲销
     */
    public void setTradeCode(String tradeCode) {
        this.tradeCode = tradeCode == null ? null : tradeCode.trim();
    }

    /**
     * 单据来源; 【参考字典表的值 BILL_SOURCE】
     * @return BILL_SOURCE 单据来源; 【参考字典表的值 BILL_SOURCE】
     */
    public String getBillSource() {
        return billSource;
    }

    /**
     * 单据来源; 【参考字典表的值 BILL_SOURCE】
     * @param billSource 单据来源; 【参考字典表的值 BILL_SOURCE】
     */
    public void setBillSource(String billSource) {
        this.billSource = billSource == null ? null : billSource.trim();
    }

    /**
     * 单据号
     * @return BILL_CODE 单据号
     */
    public String getBillCode() {
        return billCode;
    }

    /**
     * 单据号
     * @param billCode 单据号
     */
    public void setBillCode(String billCode) {
        this.billCode = billCode == null ? null : billCode.trim();
    }

    /**
     * 单据类型编码【参考字典表的值 BILL_CATEGORY】
     * @return BILL_TYPE_CODE 单据类型编码【参考字典表的值 BILL_CATEGORY】
     */
    public String getBillTypeCode() {
        return billTypeCode;
    }

    /**
     * 单据类型编码【参考字典表的值 BILL_CATEGORY】
     * @param billTypeCode 单据类型编码【参考字典表的值 BILL_CATEGORY】
     */
    public void setBillTypeCode(String billTypeCode) {
        this.billTypeCode = billTypeCode == null ? null : billTypeCode.trim();
    }

    /**
     * 单据类型名称
     * @return BILL_TYPE_NAME 单据类型名称
     */
    public String getBillTypeName() {
        return billTypeName;
    }

    /**
     * 单据类型名称
     * @param billTypeName 单据类型名称
     */
    public void setBillTypeName(String billTypeName) {
        this.billTypeName = billTypeName == null ? null : billTypeName.trim();
    }

    /**
     * 单据日期
     * @return BILL_DATE 单据日期
     */
    public Date getBillDate() {
        return billDate;
    }

    /**
     * 单据日期
     * @param billDate 单据日期
     */
    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    /**
     * 单据总金额(含税)，单位：分
     * @return TAX_TOTAL_MONEY 单据总金额(含税)，单位：分
     */
    public BigDecimal getTaxTotalMoney() {
        return taxTotalMoney;
    }

    /**
     * 单据总金额(含税)，单位：分
     * @param taxTotalMoney 单据总金额(含税)，单位：分
     */
    public void setTaxTotalMoney(BigDecimal taxTotalMoney) {
        this.taxTotalMoney = taxTotalMoney;
    }

    /**
     * 单据总金额(不含税)，单位：分
     * @return NOTAX_TOTAL_MONEY 单据总金额(不含税)，单位：分
     */
    public BigDecimal getNotaxTotalMoney() {
        return notaxTotalMoney;
    }

    /**
     * 单据总金额(不含税)，单位：分
     * @param notaxTotalMoney 单据总金额(不含税)，单位：分
     */
    public void setNotaxTotalMoney(BigDecimal notaxTotalMoney) {
        this.notaxTotalMoney = notaxTotalMoney;
    }

    /**
     * 税金，单位：分
     * @return TAX_MONEY 税金，单位：分
     */
    public BigDecimal getTaxMoney() {
        return taxMoney;
    }

    /**
     * 税金，单位：分
     * @param taxMoney 税金，单位：分
     */
    public void setTaxMoney(BigDecimal taxMoney) {
        this.taxMoney = taxMoney;
    }

    /**
     * 已核销总金额，单位：分
     * @return VERIFIED_TOTAL_MONEY 已核销总金额，单位：分
     */
    public BigDecimal getVerifiedTotalMoney() {
        return verifiedTotalMoney;
    }

    /**
     * 已核销总金额，单位：分
     * @param verifiedTotalMoney 已核销总金额，单位：分
     */
    public void setVerifiedTotalMoney(BigDecimal verifiedTotalMoney) {
        this.verifiedTotalMoney = verifiedTotalMoney;
    }

    /**
     * 未核销总金额，单位：分
     * @return NOVERIFY_TOTAL_MONEY 未核销总金额，单位：分
     */
    public BigDecimal getNoverifyTotalMoney() {
        return noverifyTotalMoney;
    }

    /**
     * 未核销总金额，单位：分
     * @param noverifyTotalMoney 未核销总金额，单位：分
     */
    public void setNoverifyTotalMoney(BigDecimal noverifyTotalMoney) {
        this.noverifyTotalMoney = noverifyTotalMoney;
    }

    /**
     * 经办人编码
     * @return OPERATOR_CODE 经办人编码
     */
    public String getOperatorCode() {
        return operatorCode;
    }

    /**
     * 经办人编码
     * @param operatorCode 经办人编码
     */
    public void setOperatorCode(String operatorCode) {
        this.operatorCode = operatorCode == null ? null : operatorCode.trim();
    }

    /**
     * 经办人名称
     * @return OPERATOR_NAME 经办人名称
     */
    public String getOperatorName() {
        return operatorName;
    }

    /**
     * 经办人名称
     * @param operatorName 经办人名称
     */
    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName == null ? null : operatorName.trim();
    }

    /**
     * 经办部门编码
     * @return OPERATOR_DEPART_CODE 经办部门编码
     */
    public String getOperatorDepartCode() {
        return operatorDepartCode;
    }

    /**
     * 经办部门编码
     * @param operatorDepartCode 经办部门编码
     */
    public void setOperatorDepartCode(String operatorDepartCode) {
        this.operatorDepartCode = operatorDepartCode == null ? null : operatorDepartCode.trim();
    }

    /**
     * 经办部门名称
     * @return OPERATOR_DEPART_NAME 经办部门名称
     */
    public String getOperatorDepartName() {
        return operatorDepartName;
    }

    /**
     * 经办部门名称
     * @param operatorDepartName 经办部门名称
     */
    public void setOperatorDepartName(String operatorDepartName) {
        this.operatorDepartName = operatorDepartName == null ? null : operatorDepartName.trim();
    }

    /**
     * 备注
     * @return REMARK 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 业务类型编码
     * @return BUSI_TYPE_CODE 业务类型编码
     */
    public String getBusiTypeCode() {
        return busiTypeCode;
    }

    /**
     * 业务类型编码
     * @param busiTypeCode 业务类型编码
     */
    public void setBusiTypeCode(String busiTypeCode) {
        this.busiTypeCode = busiTypeCode == null ? null : busiTypeCode.trim();
    }

    /**
     * 业务类型名称
     * @return BUSI_TYPE_NAME 业务类型名称
     */
    public String getBusiTypeName() {
        return busiTypeName;
    }

    /**
     * 业务类型名称
     * @param busiTypeName 业务类型名称
     */
    public void setBusiTypeName(String busiTypeName) {
        this.busiTypeName = busiTypeName == null ? null : busiTypeName.trim();
    }

    /**
     * 支付类型编码
     * @return PAY_TYPE_CODE 支付类型编码
     */
    public String getPayTypeCode() {
        return payTypeCode;
    }

    /**
     * 支付类型编码
     * @param payTypeCode 支付类型编码
     */
    public void setPayTypeCode(String payTypeCode) {
        this.payTypeCode = payTypeCode == null ? null : payTypeCode.trim();
    }

    /**
     * 支付类型名称
     * @return PAY_TYPE_NAME 支付类型名称
     */
    public String getPayTypeName() {
        return payTypeName;
    }

    /**
     * 支付类型名称
     * @param payTypeName 支付类型名称
     */
    public void setPayTypeName(String payTypeName) {
        this.payTypeName = payTypeName == null ? null : payTypeName.trim();
    }

    /**
     * sap凭证字号
     * @return SAP_VOUCHER_NUM sap凭证字号
     */
    public String getSapVoucherNum() {
        return sapVoucherNum;
    }

    /**
     * sap凭证字号
     * @param sapVoucherNum sap凭证字号
     */
    public void setSapVoucherNum(String sapVoucherNum) {
        this.sapVoucherNum = sapVoucherNum == null ? null : sapVoucherNum.trim();
    }

    /**
     * 记账结果（标识）  0：未记帐 1: 记帐成功：2:记账中  3: 记帐失败  【参考字典表的值 CAV_SAP_ACCOUNT_STATUS】
     * @return SAP_ACCOUNT_STATUS 记账结果（标识）  0：未记帐 1: 记帐成功：2:记账中  3: 记帐失败  【参考字典表的值 CAV_SAP_ACCOUNT_STATUS】
     */
    public String getSapAccountStatus() {
        return sapAccountStatus;
    }

    /**
     * 记账结果（标识）  0：未记帐 1: 记帐成功：2:记账中  3: 记帐失败  【参考字典表的值 CAV_SAP_ACCOUNT_STATUS】
     * @param sapAccountStatus 记账结果（标识）  0：未记帐 1: 记帐成功：2:记账中  3: 记帐失败  【参考字典表的值 CAV_SAP_ACCOUNT_STATUS】
     */
    public void setSapAccountStatus(String sapAccountStatus) {
        this.sapAccountStatus = sapAccountStatus == null ? null : sapAccountStatus.trim();
    }

    /**
     * 过账日期
     * @return ACCOUNT_DATE 过账日期
     */
    public Date getAccountDate() {
        return accountDate;
    }

    /**
     * 过账日期
     * @param accountDate 过账日期
     */
    public void setAccountDate(Date accountDate) {
        this.accountDate = accountDate;
    }

    /**
     * 复核人编码
     * @return REVIEWER_CODE 复核人编码
     */
    public String getReviewerCode() {
        return reviewerCode;
    }

    /**
     * 复核人编码
     * @param reviewerCode 复核人编码
     */
    public void setReviewerCode(String reviewerCode) {
        this.reviewerCode = reviewerCode == null ? null : reviewerCode.trim();
    }

    /**
     * 复核人名称
     * @return REVIEWER 复核人名称
     */
    public String getReviewer() {
        return reviewer;
    }

    /**
     * 复核人名称
     * @param reviewer 复核人名称
     */
    public void setReviewer(String reviewer) {
        this.reviewer = reviewer == null ? null : reviewer.trim();
    }

    /**
     * 复核时间
     * @return REVIEW_DATE 复核时间
     */
    public Date getReviewDate() {
        return reviewDate;
    }

    /**
     * 复核时间
     * @param reviewDate 复核时间
     */
    public void setReviewDate(Date reviewDate) {
        this.reviewDate = reviewDate;
    }

    /**
     * 复核状态  0: 未复核 1：已复核  .  【参考字典表的值 CAV_REVIEW_STATUS】
     * @return REVIEW_STAUTS 复核状态  0: 未复核 1：已复核  .  【参考字典表的值 CAV_REVIEW_STATUS】
     */
    public String getReviewStauts() {
        return reviewStauts;
    }

    /**
     * 复核状态  0: 未复核 1：已复核  .  【参考字典表的值 CAV_REVIEW_STATUS】
     * @param reviewStauts 复核状态  0: 未复核 1：已复核  .  【参考字典表的值 CAV_REVIEW_STATUS】
     */
    public void setReviewStauts(String reviewStauts) {
        this.reviewStauts = reviewStauts == null ? null : reviewStauts.trim();
    }

    /**
     * 创建时间
     * @return CREATE_DATE 创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 创建时间
     * @param createDate 创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 核销状态  0：未核销  1：已核销  2：部分核销 。【参考字典表的值 CAV_STATUS】
     * @return CAV_STATUS 核销状态  0：未核销  1：已核销  2：部分核销 。【参考字典表的值 CAV_STATUS】
     */
    public String getCavStatus() {
        return cavStatus;
    }

    /**
     * 核销状态  0：未核销  1：已核销  2：部分核销 。【参考字典表的值 CAV_STATUS】
     * @param cavStatus 核销状态  0：未核销  1：已核销  2：部分核销 。【参考字典表的值 CAV_STATUS】
     */
    public void setCavStatus(String cavStatus) {
        this.cavStatus = cavStatus == null ? null : cavStatus.trim();
    }

    /**
     * 是否硬核销【N：否  , Y：是】【参考字典表的值 CAV_FORCE_STATUS】
     * @return IS_FORCE_CAV 是否硬核销【N：否  , Y：是】【参考字典表的值 CAV_FORCE_STATUS】
     */
    public String getIsForceCav() {
        return isForceCav;
    }

    /**
     * 是否硬核销【N：否  , Y：是】【参考字典表的值 CAV_FORCE_STATUS】
     * @param isForceCav 是否硬核销【N：否  , Y：是】【参考字典表的值 CAV_FORCE_STATUS】
     */
    public void setIsForceCav(String isForceCav) {
        this.isForceCav = isForceCav == null ? null : isForceCav.trim();
    }

    /**
     * 原单据号
     * @return SRC_BILL_CODE 原单据号
     */
    public String getSrcBillCode() {
        return srcBillCode;
    }

    /**
     * 原单据号
     * @param srcBillCode 原单据号
     */
    public void setSrcBillCode(String srcBillCode) {
        this.srcBillCode = srcBillCode == null ? null : srcBillCode.trim();
    }

    /**
     * 是否冲销【0：未冲销  , 1：已冲销， 2：冲销中】   【参考字典表的值 BILL_REV_STAT】
     * @return IS_REV_CAV 是否冲销【0：未冲销  , 1：已冲销， 2：冲销中】   【参考字典表的值 BILL_REV_STAT】
     */
    public String getIsRevCav() {
        return isRevCav;
    }

    /**
     * 是否冲销【0：未冲销  , 1：已冲销， 2：冲销中】   【参考字典表的值 BILL_REV_STAT】
     * @param isRevCav 是否冲销【0：未冲销  , 1：已冲销， 2：冲销中】   【参考字典表的值 BILL_REV_STAT】
     */
    public void setIsRevCav(String isRevCav) {
        this.isRevCav = isRevCav == null ? null : isRevCav.trim();
    }

    /**
     * 是否已经回送接入系统【N：否  , Y：是】
     * @return IS_BACK_EXTSYS 是否已经回送接入系统【N：否  , Y：是】
     */
    public String getIsBackExtsys() {
        return isBackExtsys;
    }

    /**
     * 是否已经回送接入系统【N：否  , Y：是】
     * @param isBackExtsys 是否已经回送接入系统【N：否  , Y：是】
     */
    public void setIsBackExtsys(String isBackExtsys) {
        this.isBackExtsys = isBackExtsys == null ? null : isBackExtsys.trim();
    }

    /**
     * 是否带有核销关联单据【N：否  , Y：是】
     * @return IS_WITH_CAVBILL 是否带有核销关联单据【N：否  , Y：是】
     */
    public String getIsWithCavbill() {
        return isWithCavbill;
    }

    /**
     * 是否带有核销关联单据【N：否  , Y：是】
     * @param isWithCavbill 是否带有核销关联单据【N：否  , Y：是】
     */
    public void setIsWithCavbill(String isWithCavbill) {
        this.isWithCavbill = isWithCavbill == null ? null : isWithCavbill.trim();
    }

    /**
     * 是否已经完成自动核销【N：否  , Y：是】
     * @return IS_COMPLETE_AUTOCAV 是否已经完成自动核销【N：否  , Y：是】
     */
    public String getIsCompleteAutocav() {
        return isCompleteAutocav;
    }

    /**
     * 是否已经完成自动核销【N：否  , Y：是】
     * @param isCompleteAutocav 是否已经完成自动核销【N：否  , Y：是】
     */
    public void setIsCompleteAutocav(String isCompleteAutocav) {
        this.isCompleteAutocav = isCompleteAutocav == null ? null : isCompleteAutocav.trim();
    }

    /**
     * 附件数
     * @return ATTACHMENT_COUNT 附件数
     */
    public BigDecimal getAttachmentCount() {
        return attachmentCount;
    }

    /**
     * 附件数
     * @param attachmentCount 附件数
     */
    public void setAttachmentCount(BigDecimal attachmentCount) {
        this.attachmentCount = attachmentCount;
    }
}