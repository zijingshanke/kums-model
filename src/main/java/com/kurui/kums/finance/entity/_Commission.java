package com.kurui.kums.finance.entity;

// Generated 2011-10-7 4:02:06 by Hibernate Tools 3.2.2.GA

import java.math.BigDecimal;
import java.sql.Timestamp;
import com.kurui.kums.agent.Agent;
import com.kurui.kums.finance.FinanceOrder;
import com.kurui.kums.market.SaleEvent;

/**
 * Commission generated by hbm2java
 */

public class _Commission extends org.apache.struts.action.ActionForm implements
		Cloneable {

	private static final long serialVersionUID = 1L;

	protected long id;
	protected BigDecimal totalAmount;
	protected Long type;
	protected Long status;
	protected String memo;
	protected Timestamp createTime;
	protected FinanceOrder financeOrder;
	protected Agent crossAgent;
	protected SaleEvent saleEvent;

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Long getType() {
		return type;
	}

	public void setType(Long type) {
		this.type = type;
	}

	public Long getStatus() {
		return status;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public FinanceOrder getFinanceOrder() {
		return financeOrder;
	}

	public void setFinanceOrder(FinanceOrder financeOrder) {
		this.financeOrder = financeOrder;
	}

	public Agent getCrossAgent() {
		return crossAgent;
	}

	public void setCrossAgent(Agent crossAgent) {
		this.crossAgent = crossAgent;
	}

	public SaleEvent getSaleEvent() {
		return saleEvent;
	}

	public void setSaleEvent(SaleEvent saleEvent) {
		this.saleEvent = saleEvent;
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

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	// end of extra code

}
