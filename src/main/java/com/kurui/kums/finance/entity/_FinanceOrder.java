package com.kurui.kums.finance.entity;

// Generated 2011-8-5 2:49:53 by Hibernate Tools 3.2.2.GA

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import com.kurui.kums.finance.Commission;
import com.kurui.kums.finance.OrderDetail;
import com.kurui.kums.finance.OrderGroup;
import com.kurui.kums.transaction.Account;
import com.kurui.kums.agent.Agent;
import com.kurui.kums.transaction.Company;
import com.kurui.kums.transaction.Platform;

/**
 * FinanceOrder generated by hbm2java
 */
public class _FinanceOrder extends org.apache.struts.action.ActionForm
		implements Cloneable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected long id;
	protected Account account;
	protected Company company;
	protected Company cussentCompany;
	protected Platform platform;
	protected OrderGroup orderGroup;
	protected Agent agent;
	protected String orderNo;
	protected String outOrderNo;
	protected BigDecimal handlingCharge;
	protected String entryOperator;
	protected Long tranType;
	protected Long businessType;
	protected Timestamp businessTime;
	protected String memo;
	protected Long status;
	protected BigDecimal totalAmount;
	protected Long subGroupMarkNo;
	protected Timestamp createTime;
	protected String statementAmount;
	protected Timestamp maturityTime;
	protected String warningDays;
	protected Set<OrderDetail> orderDetails = new HashSet<OrderDetail>(0);
	protected Set<Commission> commissions = new HashSet<Commission>(0);

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Company getCompany() {
		return this.company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Platform getPlatform() {
		return this.platform;
	}

	public void setPlatform(Platform platform) {
		this.platform = platform;
	}

	public OrderGroup getOrderGroup() {
		return this.orderGroup;
	}

	public void setOrderGroup(OrderGroup orderGroup) {
		this.orderGroup = orderGroup;
	}

	public Agent getAgent() {
		return this.agent;
	}

	public void setAgent(Agent agent) {
		this.agent = agent;
	}

	public String getOrderNo() {
		return this.orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public BigDecimal getHandlingCharge() {
		return this.handlingCharge;
	}

	public void setHandlingCharge(BigDecimal handlingCharge) {
		this.handlingCharge = handlingCharge;
	}

	public String getEntryOperator() {
		return this.entryOperator;
	}

	public void setEntryOperator(String entryOperator) {
		this.entryOperator = entryOperator;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Long getStatus() {
		return this.status;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	public BigDecimal getTotalAmount() {
		return this.totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Long getSubGroupMarkNo() {
		return this.subGroupMarkNo;
	}

	public void setSubGroupMarkNo(Long subGroupMarkNo) {
		this.subGroupMarkNo = subGroupMarkNo;
	}

	public Long getTranType() {
		return tranType;
	}

	public void setTranType(Long tranType) {
		this.tranType = tranType;
	}

	public Long getBusinessType() {
		return businessType;
	}

	public void setBusinessType(Long businessType) {
		this.businessType = businessType;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getStatementAmount() {
		return this.statementAmount;
	}

	public void setStatementAmount(String statementAmount) {
		this.statementAmount = statementAmount;
	}

	public Company getCussentCompany() {
		return cussentCompany;
	}

	public void setCussentCompany(Company cussentCompany) {
		this.cussentCompany = cussentCompany;
	}

	public Timestamp getBusinessTime() {
		return businessTime;
	}

	public void setBusinessTime(Timestamp businessTime) {
		this.businessTime = businessTime;
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public Timestamp getMaturityTime() {
		return maturityTime;
	}

	public void setMaturityTime(Timestamp maturityTime) {
		this.maturityTime = maturityTime;
	}

	public String getWarningDays() {
		return warningDays;
	}

	public void setWarningDays(String warningDays) {
		this.warningDays = warningDays;
	}

	// The following is extra code
	public Object clone() {
		Object o = null;
		try {
			o = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return o;
	}

	private String thisAction = "";

	public String getThisAction() {
		return thisAction;
	}

	public void setThisAction(String thisAction) {
		this.thisAction = thisAction;
	}

	private int index = 0;

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public Set<OrderDetail> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(Set<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}

	public Set<Commission> getCommissions() {
		return commissions;
	}

	public void setCommissions(Set<Commission> commissions) {
		this.commissions = commissions;
	}

	// end of extra code

}
