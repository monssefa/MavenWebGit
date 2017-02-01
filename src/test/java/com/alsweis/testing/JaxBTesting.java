/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alsweis;

import com.alsweis.Employee;
import java.io.FileWriter;
import java.io.IOException;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.transform.stream.StreamResult;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Admin
 */
public class JaxBTesting {
    
    public static void main(String[] args)throws IOException, JAXBException{  
  ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");  
  Marshaller marshaller = (Marshaller)context.getBean("jaxbMarshallerBean");  
          
  Employee employee=new Employee();  
  employee.setId(101);  
  employee.setName("Sonoo Jaiswal");  
  employee.setSalary(100000);  
          
  marshaller.marshal(employee, new StreamResult(new FileWriter("employee.xml")));  
    
  System.out.println("XML Created Sucessfully");  
 }  
    
}
