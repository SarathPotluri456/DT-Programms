package com;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  
@Table(name= "Emp")  
public class Employee 
{  
@Id  
private int id;  

private String empname,addr;  
  
public int getEmpid() {  
    return id;  
}  
public void setEmpid(int id) {  
    this.id = id;  
}  
public String getEmpname()
{
return empname;
}

public void setEmpname(String ename)
{
empname=ename;
}
public String getAddr()
{
return addr;
}
public void setAdd(String myaddr)
{
addr=myaddr;
}

}  