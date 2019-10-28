package model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name ="digibank")
@SessionScoped
public class Digibank {
	
	private String name;
	private String sourcePassport;
	private String destinationPassport;
	private String destinationBank;
	private String destationCountry;
	private String accountNumber;
	private Double amount;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public DigibankEntity getEntity()
	{
		DigibankEntity digibankentity = new DigibankEntity();
		digibankentity.setName(name);
		digibankentity.setDestinationPassport(destinationPassport);
		digibankentity.setSourcePassport(sourcePassport);
		digibankentity.setDestinationBank(destinationBank);
		digibankentity.setDestationCountry(destationCountry);
		digibankentity.setAccountNumber(accountNumber);
		digibankentity.setAmount(amount);
		
		return digibankentity;
	}
	

}
