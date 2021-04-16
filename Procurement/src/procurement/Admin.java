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
public class Admin {
    private  String adminName;
    private  String adminPass;
    
    public String getadmin(){
        return adminName;
    }
    public  void setadmin(String name){
        this.adminName=name;
    }
    public  String getpass(){
        return adminPass;
    }
    public  void setPass(String pass){
        this.adminPass=pass;
    }
    
}
