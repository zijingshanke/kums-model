package com.kurui.kums.transaction.entity;

import java.sql.Timestamp;

/**
 * PriceIndex generated by hbm2java
 */

public class _DataType extends org.apache.struts.action.ActionForm implements
		Cloneable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected long id;
	protected String no;
	protected String name;
	protected String superNo;
	protected Timestamp createTime;
	protected String memo;
	protected Long status;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSuperNo() {
		return superNo;
	}

	public void setSuperNo(String superNo) {
		this.superNo = superNo;
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Long getStatus() {
		return status;
	}

	public void setStatus(Long status) {
		this.status = status;
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

	// end of extra code

}
