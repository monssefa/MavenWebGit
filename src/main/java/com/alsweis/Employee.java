/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alsweis;

import javax.xml.bind.annotation.XmlAttribute;  
import javax.xml.bind.annotation.XmlElement;  
import javax.xml.bind.annotation.XmlRootElement;  
  

/**
 *
 * @author Admin
 */
@XmlRootElement(name="employee")  
public class Employee {

    private int id;  
   private String name;  
   private float salary;  
    
  
@XmlAttribute(name="id")  
public int getId() {  
    return id;  
}

public void setId(int id) {  
    this.id = id;  
}  

@XmlElement(name="name")  
public String getName() {  
    return name;  
}  

public void setName(String name) {  
    this.name = name;  
}  

@XmlElement(name="salary")  
public float getSalary() {  
    return salary;  
}  

public void setSalary(float salary) {  
    this.salary = salary;  
}  
    
}
