package com.kurui.kums.report;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

import com.kurui.kums.base.Constant;
import com.kurui.kums.base.util.DateUtil;
import com.kurui.kums.base.util.StringUtil;
import com.kurui.kums.finance.FinanceOrder;
import com.kurui.kums.finance.Statement;
import com.kurui.kums.transaction.Account;

public class OrderStatement {     	
	private FinanceOrder order;
	
	private BigDecimal inAmount=BigDecimal.ZERO;
	private BigDecimal outAmount=BigDecimal.ZERO;	
	

	public OrderStatement() {

	}
	
	public OrderStatement(FinanceOrder order) {
//		System.out.println("=====OrderStatement(FinanceOrder order)=====");
	}
	
	public OrderStatement(BigDecimal inAmount,BigDecimal outAmount) {
		this.inAmount=Constant.toBigDecimal(inAmount);
		this.inAmount=Constant.toBigDecimal(outAmount);
	}
	
	
	//无法识别
	public OrderStatement(FinanceOrder tempOrder,List<String> inStatement,List<String>  outStatement,List<String>  inRefundStatement,List<String>  outRefundStatement) {
		this.order=tempOrder;	
		
		System.out.println("===list string :"+inStatement);		
	}
	
	public OrderStatement(FinanceOrder tempOrder,String inStatement,String outStatement,String inRefundStatement,String outRefundStatement) {
		this.order=tempOrder;	
		
		setOrderAsStatement(inStatement,Statement.SUBTYPE_10);
		setOrderAsStatement(outStatement,Statement.SUBTYPE_20);
		setOrderAsStatement(inRefundStatement,Statement.SUBTYPE_11);
		setOrderAsStatement(outRefundStatement,Statement.SUBTYPE_21);
	}
	
	public void setOrderAsStatement(String statementStr,long subType){
		statementStr=Constant.toString(statementStr);
		String accountName=StringUtil.getBetweenString(statementStr, "<accountName>","</accountName>");
		String accountNo=StringUtil.getBetweenString(statementStr, "<accountNo>","</accountNo>");
		String totalAmount=StringUtil.getBetweenString(statementStr, "<totalAmount>","</totalAmount>");
		String statementDate=StringUtil.getBetweenString(statementStr, "<statementDate>","</statementDate>");
		Timestamp statementTime=null;
		if("".equals(statementDate)==false){
			 statementTime=DateUtil.getTimestamp(statementDate,"yyyy-MM-dd HH:mm:ss");
		}
		String memo=StringUtil.getBetweenString(statementStr, "<memo>","</memo>");

		if(subType==Statement.SUBTYPE_10){	
//			this.order.setInAccountName(accountName);
//			this.order.setInAccountNo(accountNo);
//			this.order.setInAmount(Constant.toBigDecimal(totalAmount));
//			this.order.setInTime(statementTime);	
//			this.order.setInMemo(memo);
		}
		if(subType==Statement.SUBTYPE_11){	
//			this.order.setInRefundAccountName(accountName);
//			this.order.setInRefundAccountNo(accountNo);
//			this.order.setInRefundAmount(Constant.toBigDecimal(totalAmount));
//			this.order.setInRefundTime(statementTime);	
//			this.order.setInRefundMemo(memo);
		}
		if(subType==Statement.SUBTYPE_20){	
//			this.order.setOutAccountName(accountName);
//			this.order.setOutAccountNo(accountNo);
//			this.order.setOutAmount(Constant.toBigDecimal(totalAmount));
//			this.order.setOutTime(statementTime);	
//			this.order.setOutMemo(memo);
		}
		if(subType==Statement.SUBTYPE_21){	
//			this.order.setOutRefundAccountName(accountName);
//			this.order.setOutRefundAccountNo(accountNo);
//			this.order.setOutRefundAmount(Constant.toBigDecimal(totalAmount));
//			this.order.setOutRefundTime(statementTime);	
//			this.order.setOutRefundMemo(memo);
		}		
	}	
	
	
	
	public OrderStatement(FinanceOrder tempOrder,Account inAccount,Account outAccount,
			Account inRefundAccount,Account outRefundAccount,BigDecimal inAmount,
			BigDecimal outAmount, BigDecimal inRefundAmount,
			BigDecimal outRefundAmount, java.util.Date inTime, java.util.Date outTime,
			java.util.Date inRefundTime, java.util.Date outRefundTime) {
		this.order=tempOrder;	
		
		if(inAccount!=null){
//			this.order.setInAccountName(inAccount.getName());
//			this.order.setInAccountNo(inAccount.getAccountNo());			
		}
		if(inRefundAccount!=null){
//			this.order.setInRefundAccountName(inRefundAccount.getName());
//			this.order.setInRefundAccountNo(inRefundAccount.getAccountNo());			
		}
		if(outAccount!=null){
//			this.order.setOutAccountName(outAccount.getName());
//			this.order.setOutAccountNo(outAccount.getAccountNo());			
		}
		if(outRefundAccount!=null){
//			this.order.setOutRefundAccountName(outRefundAccount.getName());
//			this.order.setOutRefundAccountNo(outRefundAccount.getAccountNo());			
		}
		
//		this.order.setInAmount(Constant.toBigDecimal(inAmount));
//		this.order.setOutAmount(Constant.toBigDecimal(outAmount));
//		this.order.setInRefundAmount(Constant.toBigDecimal(inRefundAmount));
//		this.order.setOutRefundAmount(Constant.toBigDecimal(outRefundAmount));
		
		Timestamp tempinTime=null;
		Timestamp tempoutTime=null;
		Timestamp tempinRefundTime=null;
		Timestamp tempoutRefundTime=null;
		
		if(inTime!=null){
			tempinTime =  new java.sql.Timestamp(inTime.getTime());
		}
		if(outTime!=null){
			tempoutTime =  new java.sql.Timestamp(outTime.getTime());
		}
		if(inRefundTime!=null){
			tempinRefundTime =  new java.sql.Timestamp(inRefundTime.getTime());
		}
		if(outRefundTime!=null){
			tempoutRefundTime =  new java.sql.Timestamp(outRefundTime.getTime());
		}
//		this.order.setInTime(tempinTime);
//		this.order.setOutTime(tempoutTime);
//		this.order.setInRefundTime(tempinRefundTime);
//		this.order.setOutRefundTime(tempoutRefundTime);
	}

	public void setOrder(FinanceOrder order) {
		this.order = order;
	}
	public FinanceOrder getOrder() {
		return order;
	}

	public BigDecimal getInAmount() {
		return inAmount;
	}

	public void setInAmount(BigDecimal inAmount) {
		this.inAmount = inAmount;
	}

	public BigDecimal getOutAmount() {
		return outAmount;
	}

	public void setOutAmount(BigDecimal outAmount) {
		this.outAmount = outAmount;
	}
	
	
}
