package beanconfig;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class ApplicationContextProvider implements ApplicationContextAware {
	
	  public static final Logger LOG = LoggerFactory.getLogger(ApplicationContextProvider.class);
    @Autowired
    private static ApplicationContext context;
     
    private ApplicationContextProvider(){}
    @Autowired
    public static ApplicationContext getApplicationContext() {
        return context;
    }
    @Autowired
    public  static <T> T getBean(String name,Class<T> aClass){
        return context.getBean(name,aClass);
    }

    @Override
    public void setApplicationContext(ApplicationContext ctx)  {
      try {	
        context = ctx;
      }catch (BeansException be) {
		
    	  LOG.debug("BeansException:" + be);
	}
    }
}
