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
public class Employ {
    private  String EmployName;
    private  String EmployPass;
    
    public String getEmp(){
        return EmployName;
    }
    public  void setEmp(String name){
        this.EmployName=name;
    }
    public  String getpass(){
        return EmployPass;
    }
    public  void setPass(String pass){
        this.EmployPass=pass;
    }
    
}
