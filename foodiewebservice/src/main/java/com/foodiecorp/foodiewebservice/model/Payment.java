package com.foodiecorp.foodiewebservice.model;

public class Payment {
	String ccHolderName;
	String ccNumber;
	Integer expMonth;
	Integer expYear;
	Integer cvv;
	public Payment() {
		// TODO Auto-generated constructor stub
	}
	public Payment(String ccHolderName, String ccNumber, Integer expMonth, Integer expYear, Integer cvv) {
		this.ccHolderName = ccHolderName;
		this.ccNumber = ccNumber;
		this.expMonth = expMonth;
		this.expYear = expYear;
		this.cvv = cvv;
	}
	public String getCcHolderName() {
		return ccHolderName;
	}
	public void setCcHolderName(String ccHolderName) {
		this.ccHolderName = ccHolderName;
	}
	public String getCcNumber() {
		return ccNumber;
	}
	public void setCcNumber(String ccNumber) {
		this.ccNumber = ccNumber;
	}
	public Integer getExpMonth() {
		return expMonth;
	}
	public void setExpMonth(Integer expMonth) {
		this.expMonth = expMonth;
	}
	public Integer getExpYear() {
		return expYear;
	}
	public void setExpYear(Integer expYear) {
		this.expYear = expYear;
	}
	public Integer getCvv() {
		return cvv;
	}
	public void setCvv(Integer cvv) {
		this.cvv = cvv;
	}
	@Override
	public String toString() {
		return "Payment [ccHolderName=" + ccHolderName + ", ccNumber=" + ccNumber + ", expMonth=" + expMonth
				+ ", expYear=" + expYear + ", cvv=" + cvv + "]";
	}

}
