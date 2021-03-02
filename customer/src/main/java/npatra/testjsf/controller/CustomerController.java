package npatra.testjsf.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import npatra.testjsf.crud.CustomerRepository;
import npatra.testjsf.domain.Customer;
import npatra.testjsf.service.CustomerService;

@ManagedBean(name="customerController")
@Controller
public class CustomerController implements Serializable {
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	  @Autowired
	 private CustomerService service;
	  
	  @Autowired
	  private CustomerRepository repo;
  
    @RequestMapping("/")
	public String index(ModelMap modelMap) {
	    modelMap.addAttribute("customerAttribute", "customerAttribute");
		modelMap.put("customer", new Customer());
		return "index.xhtml";
	}
  
   
  public CustomerController() {
		super();
	}

    public CustomerService getService() {
		return service;
	}


	public void setService(CustomerService service) {
		this.service = service;
	}


public CustomerController(CustomerService service) {
		super();
		this.service = service;
	}



   @PostMapping
   public void saves(@RequestParam Customer customer) {
	
       repo.save(customer);
   } 
   
   @DeleteMapping("/customer/{id}")    
   public String delete(@PathVariable Long id){    
	   Customer customer =repo.getOne(id);
       repo.delete(customer);   
       return "index.xhtml";    
   }     
   
  @GetMapping(path="/customer")
  public List<Customer> getAll(){
	  return repo.findAll();
  }
   public String goodbye(SessionStatus status) {
	   status.setComplete();
    return null;
   }

}
