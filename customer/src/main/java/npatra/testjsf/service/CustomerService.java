package npatra.testjsf.service;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.data.jpa.support.ClasspathScanningPersistenceUnitPostProcessor;
import org.springframework.ejb.interceptor.SpringBeanAutowiringInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import npatra.testjsf.CustomerApplication;
import npatra.testjsf.beanconfig.ApplicationContextProvider;
import npatra.testjsf.controller.CustomerController;
import npatra.testjsf.crud.CustomerRepository;
import npatra.testjsf.domain.Customer;


@Service
@Component
public class CustomerService extends SpringBeanAutowiringSupport{
	   private static final Logger LOG = 
			   LoggerFactory.getLogger(CustomerService.class);
	   
	 @Autowired 
	private CustomerRepository cutstomerepository;

	public CustomerService() {
		super();
	}

	public CustomerRepository getCutstomerepository() {
		return cutstomerepository;
	}
	
	public void setCutstomerepository(CustomerRepository cutstomerepository) {
		this.cutstomerepository = cutstomerepository;
	}

	public CustomerService(CustomerRepository cutstomerepository) {
		super();
		this.cutstomerepository = cutstomerepository;
	}
	
	public void save(Customer customer) {
		
	    cutstomerepository.save(customer);
	   
	  
	   
	}

}
