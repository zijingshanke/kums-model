package com.kurui.kums.transaction;

import com.kurui.kums.transaction.entity._PlatComAccount;

public class PlatComAccount extends _PlatComAccount {
	private static final long serialVersionUID = 1L;

	private long accountId;// 支付账号ID
	private long companyId;// 公司ID
	private long platformId;// 交易平台ID
	private long paymentToolId;// 支付工具ID

	// 状态
	public static final long STATES_1 = 1;// 有效
	public static final long STATES_0 = 0;// 无效

	// 状态
	public String getStatusInfo() {
		if (this.getStatus() != null) {
			if (this.getStatus() == STATES_1) {
				return "有效";
			} else if (this.getStatus().intValue() == STATES_0) {
				return "无效";
			} else {
				return null;
			}
		} else {
			return null;
		}
	}

	public String getTypeCaption() {
		if (this.getType() != null) {
			if (this.getType() == 1) {
				return "收款";
			} else if (this.getType() == 2) {
				return "付款";
			} else if (this.getType() == 3) {
				return "收付款";
			} else {
				return "";
			}
		} else {
			return "";
		}
	}

	public String getTypeInfo() {
		if (this.getType() != null) {
			return "";
		} else {
			return null;
		}
	}

	public long getPaymentToolId() {
		return paymentToolId;
	}

	public void setPaymentToolId(long paymentToolId) {
		this.paymentToolId = paymentToolId;
	}

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(long companyId) {
		this.companyId = companyId;
	}

	public long getPlatformId() {
		return platformId;
	}

	public void setPlatformId(long platformId) {
		this.platformId = platformId;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

}
