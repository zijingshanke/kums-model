package com.kurui.kums.transaction.entity;

import com.kurui.kums.transaction.Account;
import com.kurui.kums.transaction.Company;

// Generated 2011-9-20 11:29:51 by Hibernate Tools 3.2.2.GA

/**
 * CompanyAccount generated by hbm2java
 */

public class _CompanyAccount extends org.apache.struts.action.ActionForm
		implements Cloneable {

	private static final long serialVersionUID = 1L;
	protected long id;
	protected Company company;
	protected Account account;
	protected Long status;

	
	public Long getStatus() {
		return status;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
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
