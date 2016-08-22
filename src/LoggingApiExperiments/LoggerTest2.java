/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoggingApiExperiments;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerTest2 {
    
    private final static Logger logger = Logger.getLogger(LoggerTest.class.getName());
 
 public static void thing(){
 logger.log(Level.WARNING,"something to log");
    
}
}