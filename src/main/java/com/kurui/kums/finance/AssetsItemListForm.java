package com.kurui.kums.finance;

import com.kurui.kums.base.ListActionForm;

public class AssetsItemListForm extends ListActionForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public long id = Long.valueOf(0);

	public Long status = Long.valueOf(0);
	
	public String contactWay = "";
	
	public String getContactWay() {
		return contactWay;
	}

	public void setContactWay(String contactWay) {
		this.contactWay = contactWay;
	}

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

}
