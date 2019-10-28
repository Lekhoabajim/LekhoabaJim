package service;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.DigibankEntity;

/**
 * Session Bean implementation class DigibankEJB
 */
@Stateless
@LocalBean
public class DigibankEJB {

	@EJB
    @PersistenceContext
    private EntityManager em;
    public DigibankEJB() {
        // TODO Auto-generated constructor stub
    }
    public void addNew(DigibankEntity digibankEntity)
    {
    	System.out.println("*****Adding Digibank to database*****");
    	em.persist(digibankEntity);
    	System.out.println("*****Added Successfully*****");
    }

}
