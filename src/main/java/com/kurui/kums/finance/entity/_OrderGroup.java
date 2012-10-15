package com.kurui.kums.finance.entity;

/**
 * OrderGroup generated by hbm2java
 */

public class _OrderGroup

extends org.apache.struts.action.ActionForm implements Cloneable {
	private static final long serialVersionUID = 1L;

	// Fields

	protected long id;
	protected String no;
	protected java.sql.Timestamp firstTime;
	protected java.sql.Timestamp lastTime;
	protected Long status;
	protected java.util.Set financeOrders = new java.util.HashSet(0);

	// Constructors

	// Property accessors

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNo() {
		return this.no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public java.sql.Timestamp getFirstTime() {
		return firstTime;
	}

	public void setFirstTime(java.sql.Timestamp firstTime) {
		this.firstTime = firstTime;
	}

	public java.sql.Timestamp getLastTime() {
		return lastTime;
	}

	public void setLastTime(java.sql.Timestamp lastTime) {
		this.lastTime = lastTime;
	}

	public Long getStatus() {
		return this.status;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	public java.util.Set getfinanceOrders() {
		return this.financeOrders;
	}

	public void setfinanceOrders(java.util.Set financeOrders) {
		this.financeOrders = financeOrders;
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
