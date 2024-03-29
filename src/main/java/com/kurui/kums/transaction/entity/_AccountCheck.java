package com.kurui.kums.transaction.entity;

/**
 * AccountCheck generated by hbm2java
 */

public class _AccountCheck

extends org.apache.struts.action.ActionForm implements Cloneable {
	private static final long serialVersionUID = 1L;

	// Fields

	protected long id;
	protected java.math.BigDecimal checkOnAmount;
	protected java.math.BigDecimal transInAmount;
	protected java.math.BigDecimal transOutAmount;
	protected java.math.BigDecimal payAmount;
	protected java.math.BigDecimal refundAmount;
	protected java.math.BigDecimal checkOffAmount;
	protected java.sql.Timestamp checkOnTime;
	protected Long type;
	protected Long status;
	protected String note;
	protected java.sql.Timestamp checkOffTime;
	protected com.kurui.kums.right.SysUser sysUser;
	protected com.kurui.kums.transaction.Account account;

	// Constructors

	// Property accessors

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public java.math.BigDecimal getCheckOnAmount() {
		return this.checkOnAmount;
	}

	public void setCheckOnAmount(java.math.BigDecimal checkOnAmount) {
		this.checkOnAmount = checkOnAmount;
	}

	public java.math.BigDecimal getTransInAmount() {
		return this.transInAmount;
	}

	public void setTransInAmount(java.math.BigDecimal transInAmount) {
		this.transInAmount = transInAmount;
	}

	public java.math.BigDecimal getTransOutAmount() {
		return this.transOutAmount;
	}

	public void setTransOutAmount(java.math.BigDecimal transOutAmount) {
		this.transOutAmount = transOutAmount;
	}

	public java.math.BigDecimal getPayAmount() {
		return this.payAmount;
	}

	public void setPayAmount(java.math.BigDecimal payAmount) {
		this.payAmount = payAmount;
	}

	public java.math.BigDecimal getRefundAmount() {
		return this.refundAmount;
	}

	public void setRefundAmount(java.math.BigDecimal refundAmount) {
		this.refundAmount = refundAmount;
	}

	public java.math.BigDecimal getCheckOffAmount() {
		return this.checkOffAmount;
	}

	public void setCheckOffAmount(java.math.BigDecimal checkOffAmount) {
		this.checkOffAmount = checkOffAmount;
	}

	public Long getType() {
		return this.type;
	}

	public void setType(Long type) {
		this.type = type;
	}

	public Long getStatus() {
		return this.status;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public java.sql.Timestamp getCheckOnTime() {
		return checkOnTime;
	}

	public void setCheckOnTime(java.sql.Timestamp checkOnTime) {
		this.checkOnTime = checkOnTime;
	}

	public java.sql.Timestamp getCheckOffTime() {
		return checkOffTime;
	}

	public void setCheckOffTime(java.sql.Timestamp checkOffTime) {
		this.checkOffTime = checkOffTime;
	}

	public com.kurui.kums.right.SysUser getSysUser() {
		return this.sysUser;
	}

	public void setSysUser(com.kurui.kums.right.SysUser sysUser) {
		this.sysUser = sysUser;
	}

	public com.kurui.kums.transaction.Account getAccount() {
		return this.account;
	}

	public void setAccount(com.kurui.kums.transaction.Account account) {
		this.account = account;
	}

	// The following is extra code specified in the hbm.xml files

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

	// end of extra code specified in the hbm.xml files

}
