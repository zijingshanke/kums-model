package com.kurui.kums.report;

public class Report extends org.apache.struts.action.ActionForm implements
		Cloneable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected long row = Long.valueOf(0);
	protected String tranType = "";
	protected Long businessType = Long.valueOf(0);

	private Long operatorDepart = Long.valueOf(0);
	private String operator = "";

	private String statusGroup = "";
	private String ticketTypeGroup = "";
	private String tranTypeGroup = "";
	private String businessTypeGroup = "";
	private String startDate = "";// 开始时间
	private String endDate = "";// 结束时间
	private String downloadDate = "";

	private String[] salePlatformIds;
	private String[] buyPlatformIds;
	private String[] receiveAccountIds;
	private String[] payAccountIds;

	private boolean isRakeOff = false;

	private Long reportType;

	/** 散票销售报表<财务> */
	public static final long ReportType1 = 1;

	/** 散票销售报表<政策> */
	public static final long ReportType2 = 2;

	/** 散票退废报表<财务> */
	public static final long ReportType11 = 11;

	/** 团队统计报表<财务> */
	public static final long ReportType51 = 51;

	/** 团队未返报表<政策> */
	public static final long ReportType52 = 52;

	private String[] optHead = new String[100];

	public Report() {

	}

	private String thisAction = "";

	public long getRow() {
		return row;
	}

	public void setRow(long row) {
		this.row = row;
	}

	public Long getOperatorDepart() {
		return operatorDepart;
	}

	public void setOperatorDepart(Long operatorDepart) {
		this.operatorDepart = operatorDepart;
	}

	public Long getReportType() {
		return reportType;
	}

	public void setReportType(Long reportType) {
		this.reportType = reportType;
	}

	public boolean isRakeOff() {
		return isRakeOff;
	}

	public void setRakeOff(boolean isRakeOff) {
		this.isRakeOff = isRakeOff;
	}

	public String getThisAction() {
		return thisAction;
	}

	public String getTicketTypeGroup() {
		return ticketTypeGroup;
	}

	public void setTicketTypeGroup(String ticketTypeGroup) {
		this.ticketTypeGroup = ticketTypeGroup;
	}

	public String getTranTypeGroup() {
		return tranTypeGroup;
	}

	public void setTranTypeGroup(String tranTypeGroup) {
		this.tranTypeGroup = tranTypeGroup;
	}

	public String getBusinessTypeGroup() {
		return businessTypeGroup;
	}

	public void setBusinessTypeGroup(String businessTypeGroup) {
		this.businessTypeGroup = businessTypeGroup;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public void setThisAction(String thisAction) {
		this.thisAction = thisAction;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getTranType() {
		return tranType;
	}

	public void setTranType(String tranType) {
		this.tranType = tranType;
	}

	public Long getBusinessType() {
		return businessType;
	}

	public void setBusinessType(Long businessType) {
		this.businessType = businessType;
	}

	public String getStatusGroup() {
		return statusGroup;
	}

	public void setStatusGroup(String statusGroup) {
		this.statusGroup = statusGroup;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String[] getSalePlatformIds() {
		return salePlatformIds;
	}

	public void setSalePlatformIds(String[] salePlatformIds) {
		this.salePlatformIds = salePlatformIds;
	}

	public String[] getBuyPlatformIds() {
		return buyPlatformIds;
	}

	public void setBuyPlatformIds(String[] buyPlatformIds) {
		this.buyPlatformIds = buyPlatformIds;
	}

	public String[] getReceiveAccountIds() {
		return receiveAccountIds;
	}

	public void setReceiveAccountIds(String[] receiveAccountIds) {
		this.receiveAccountIds = receiveAccountIds;
	}

	public String[] getPayAccountIds() {
		return payAccountIds;
	}

	public void setPayAccountIds(String[] payAccountIds) {
		this.payAccountIds = payAccountIds;
	}

	public String getDownloadDate() {
		return downloadDate;
	}

	public void setDownloadDate(String downloadDate) {
		this.downloadDate = downloadDate;
	}

	public String[] getOptHead() {
		return optHead;
	}

	public void setOptHead(String[] optHead) {
		this.optHead = optHead;
	}

}
