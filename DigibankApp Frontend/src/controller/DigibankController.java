package controller;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import model.Digibank;
import service.DigibankEJB;

@ManagedBean(name = "digibankcontroller")
@SessionScoped
public class DigibankController {
	
	@EJB
	DigibankEJB digibankservice;
	
	@ManagedProperty(value ="#{digibank}")
	private Digibank digibank;
	
public void addNewDigibank()
{
	System.out.println("********in Use******");
	digibankservice.addNew(digibank.getEntity());
	System.out.println("********Digibank Added successfully******");
	}
	
	public Digibank getDigibank() {
		return digibank;
	}

	public void setDigibank(Digibank digibank) {
		this.digibank = digibank;
	}
	
	
	

}
