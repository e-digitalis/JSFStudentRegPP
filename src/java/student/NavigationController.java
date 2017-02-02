/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Elisabeth
 */
@Named(value = "navigationController")
@RequestScoped
public class NavigationController {

    private String  location;
    public String getLocation(){
        return location;
    }
    
    public void setLocation(String location){
        this.location = location;
    }
    
    
        public String navigate() {
            String navAction = null;
        if (this.location.equals("Stockholm")){
            navAction = "confirmation";
            } else {
            navAction = "confirmation2";
        }
        return navAction;
    }
    
    /**
     * Creates a new instance of NavigationController
     */
    public NavigationController() {
    }
    
}
