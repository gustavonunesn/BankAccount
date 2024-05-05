package model.entities;

import model.exceptions.DomainExceptions;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account() {
	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public Double getBalance() {
		return balance;
	}
	public Double getWithdrawLimit() {
		return withdrawLimit;
	}
	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	public Double deposit(Double amount) {
		return balance += amount;
	}
	public Double withdraw(Double amount) throws DomainExceptions{
		if(balance - amount <= 0) {
			throw new DomainExceptions("Not enough balance.");
		}
		else if(amount > getWithdrawLimit()) {
			throw new DomainExceptions("The amount exceeds withdraw limit");
		}
		else {
			return balance -= amount;
	}
		}
	public String toString() {
		return "New balance: " + balance;
	}
}


