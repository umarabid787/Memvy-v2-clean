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
public class Employy {
    private  String EmployName;
    private String EmployEmail;
    private String EmployCnic;
    private String EmployPhone;
    private  String EmployPass;
    private String EmployAddress;
    
    public String getEmp(){
        return EmployName;
    }
    public  void setEmp(String name){
        this.EmployName=name;
    }
    public String getEmaiil(){
        return EmployEmail;
    }
    public void setEamil(String email){
        this.EmployEmail=email;
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
    public  String getpass(){
        return EmployPass;
    }
    public  void setPass(String pass){
        this.EmployPass=pass;
    }
    public String getAddress(){
        return EmployAddress;
    }
    public void setAddress(String address){
        this.EmployAddress=address;
    }
}
