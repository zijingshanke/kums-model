package com.kurui.kums.market.entity;

// Generated 2011-10-7 4:02:06 by Hibernate Tools 3.2.2.GA

import java.util.HashSet;
import java.util.Set;

import com.kurui.kums.finance.Commission;

/**
 * SaleEvent generated by hbm2java
 */

public class _SaleEvent extends org.apache.struts.action.ActionForm implements
		Cloneable {

	private static final long serialVersionUID = 1L;

	protected long id;
	protected String name;
	protected Long type;
	protected Long status;
	protected String memo;
	protected Set<Commission> commissions = new HashSet<Commission>(0);

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Set<Commission> getCommissions() {
		return commissions;
	}

	public void setCommissions(Set<Commission> commissions) {
		this.commissions = commissions;
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
