/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 *
 * @author elyvic
 */
public class Controller {
    Model model = new Model();
    GUI gui = new GUI();
    
    public Controller(Model model, GUI gui){
        
        
        gui.getSubmitBtn().setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                
            }
        });
        
        gui.getAddBtn().setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              gui.AddCounter();
            }
        });
         
        gui.getResetBtn().setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                gui.Clearfields();
                
            }
        });
          
        gui.getNextBtn().setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                
            }
        });
        
        gui.getPreviousBtn().setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                
            }
        });
         
        gui.getViewAllBtn().setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                
            }
        });
    }
}
