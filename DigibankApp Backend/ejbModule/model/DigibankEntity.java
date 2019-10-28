package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="digibank_tbl")
public class DigibankEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long transactionCode;
	private String name;
	private String sourcePassport;
	private String destinationPassport;
	private String destinationBank;
	private String destationCountry;
	private String accountNumber;
	private  Double Amount;
	public Long getTransactionCode() {
		return transactionCode;
	}
	public void setTransactionCode(Long transactionCode) {
		this.transactionCode = transactionCode;
	}
	public String getSourcePassport() {
		return sourcePassport;
	}
	public void setSourcePassport(String sourcePassport) {
		this.sourcePassport = sourcePassport;
	}
	public String getDestinationPassport() {
		return destinationPassport;
	}
	public void setDestinationPassport(String destinationPassport) {
		this.destinationPassport = destinationPassport;
	}
	public String getDestinationBank() {
		return destinationBank;
	}
	public void setDestinationBank(String destinationBank) {
		this.destinationBank = destinationBank;
	}
	public String getDestationCountry() {
		return destationCountry;
	}
	public void setDestationCountry(String destationCountry) {
		this.destationCountry = destationCountry;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Double getAmount() {
		return Amount;
	}
	public void setAmount(Double amount) {
		this.Amount = amount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
