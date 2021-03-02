package npatra.testjsf.domain;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.context.Flash;
import javax.faces.event.ComponentSystemEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.web.context.annotation.SessionScope;

import npatra.testjsf.beanconfig.ApplicationContextProvider;
import npatra.testjsf.crud.CustomerRepository;

@Entity
@ManagedBean(name="customer")
public class Customer implements Serializable{
	
	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  private Long id;
	  
	  private String firstName;
	  
	  private String lastName;
	  public Customer() {}
  
	public Customer(String firstName, String lastName) {
		super();
		
		this.firstName = firstName;
		this.lastName = lastName;
		
	 }



	@Override
	  public String toString() {
	    return String.format(
	        "Customer[id=%d, firstName='%s', lastName='%s']",
	        id, firstName, lastName);
	  }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	 public void pullValuesFromFlash(ComponentSystemEvent e) {
	        Flash flash = FacesContext.getCurrentInstance().getExternalContext().getFlash();
	        firstName = (String)flash.get("firstName");
	        lastName = (String)flash.get("lastName");
	    }

	
	
	
	
}
