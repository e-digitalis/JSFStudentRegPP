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
public class NavigationController123124 {

    public String navigate() {
        String navAction = "confirmation";
        return navAction;
    }

    /**
     * Creates a new instance of NavigationController
     */
    public NavigationController123124() {
    }

}
