package com.kurui.kums.transaction;

import com.kurui.kums.base.util.PingYin;
import com.kurui.kums.transaction.entity._PaymentTool;

public class PaymentTool extends _PaymentTool {
	private static final long serialVersionUID = 1L;

	// 类型
	public static final long TYPE_1 = 1;// 银行
	public static final long TYPE_2 = 2;// 支付平台
	public static final long TYPE_3 = 3;// 现金

	// 状态
	public static final long STATES_1 = 1;// 有效
	public static final long STATES_0 = 0;// 无效
	private String charSet="GBK";
	
	public String getShowName() {
		if (this.name != null && "".equals(this.name) == false) {
			String myFirstLetter = PingYin.getFirstLetter(this.name,charSet);
			if (myFirstLetter != null && myFirstLetter.length() > 1) {
				myFirstLetter = myFirstLetter.substring(0, 1);
				return myFirstLetter + "-" + this.name;
			}
		}
		return this.name;
	}

	public String getTypeInfo() {
		if (this.getType() != null) {
			if (this.getType().intValue() == TYPE_1) {
				return "银行";
			} else if (this.getType().intValue() == TYPE_2) {
				return "支付平台";
			} else if (this.getType().intValue() == TYPE_3) {
				return "现金";
			} else {
				return null;
			}
		} else {
			return null;
		}
	}

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
}
