/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import home.loginSistem;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.PropertyConfigurator;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BasicConfigurator.configure();
        String log4jConfPath="/path/to/log4j.properties";
        PropertyConfigurator.configure(log4jConfPath);
        
        loginSistem login = new loginSistem();
        
        login.setVisible(true);
        
    }
    
}
