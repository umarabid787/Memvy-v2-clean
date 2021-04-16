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
public class Manager {
    private  String ManName;
    private  String ManPass;
    
    public String getMan(){
        return ManName;
    }
    public  void setMan(String name){
        this.ManName=name;
    }
    public  String getpass(){
        return ManPass;
    }
    public  void setPas(String pass){
        this.ManPass=pass;
    }
    
}
