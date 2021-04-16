/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procurement;

/**
 *
 * @author Junaid Butt
 */
public class Request {
     private  String EmployName;
    private String request;
    private String EmployCnic;
    private String EmployPhone;
    private String Amount;
    
    public String getEmp(){
        return EmployName;
    }
    public  void setEmp(String name){
        this.EmployName=name;
    }
     public String getrequest(){
        return request;
    }
    public void setreq(String request){
        this.request=request;
    }
    
    public String getCNIC(){
        return EmployCnic;
    }
    public void setCnic(String cnic){
        this.EmployCnic=cnic;
    }
    public String getNum(){
        return EmployPhone;
    }
    public void setPhone(String phone){
        this.EmployPhone=phone;
    }
    
     public String getamoub(){
        return Amount;
    }
    public void setAmo(String amoi){
        this.Amount=amoi;
    }
    
    
    
}
