package com.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

public class UserClaim {
	
	private String expenseType;
	//validation for not null and setting the message to be displayed
	@NotNull(message="{error.expenseAmount}")
	@Min(value=1,message="{error.expenseAmount.negative}")
	private double expenseAmt;
	//validation annotation for displaying if there is error in the data
	@NotEmpty(message="{error.employeeId}")
	@Length(min=5,message="{error.employeeId.length}")
	private String employeeId;
	
	public String getExpenseType() {
		return expenseType;
	}
	public void setExpenseType(String expenseType) {
		this.expenseType = expenseType;
	}
	public double getExpenseAmt() {
		return expenseAmt;
	}
	public void setExpenseAmt(double expenseAmt) {
		this.expenseAmt = expenseAmt;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	
	
	
}
