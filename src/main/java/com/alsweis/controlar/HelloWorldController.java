package com.alsweis.controlar;

import com.alsweis.Employee;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.springframework.stereotype.Controller;  
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Admin
 */

@Controller 
public class HelloWorldController {
    
    JAXBContext contextObj = null;  
    @RequestMapping("/helloo.htm")  
    public String helloWorld(ModelMap modelMap, HttpServletRequest request,HttpServletResponse res) throws JAXBException, FileNotFoundException {
        //System.out.println("on method");
        
        contextObj = JAXBContext.newInstance( Employee.class );
        
        Marshaller marshallerObj = contextObj.createMarshaller();  
        marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);  
  
         Employee employee=new Employee();  
        employee.setId(101);  
        employee.setName("Sonoo Jaiswal");  
        employee.setSalary(100000);   
      
    marshallerObj.marshal(employee, new FileOutputStream("D:\\Web Services\\employee.xml"));  
        
        
       // ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");  
        
        String message = "HELLO SPRING MVC HOW R U";  
        String name=request.getParameter("name");  
        
        modelMap.put("message", message);
        modelMap.put("name", name);
        return "hellopage";
    }
    
    
}
