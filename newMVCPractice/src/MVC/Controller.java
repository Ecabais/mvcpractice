/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import static javax.management.Query.value;

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
                String hunt = gui.getHuntTF().getText();
                String chain = gui.getChainTF().getText();
                
                Data currentData = new Data(hunt, chain);
                model.setCurrentHunt(currentData);
                
                gui.Clearfields();
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
                
                ArrayList<Data> currentData = model.getAllHunts();
                gui.updateViewNext(currentData);
                
               
            }
        });
        
        gui.getPreviousBtn().setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                ArrayList<Data> currentData = model.getAllHunts();
                gui.updateViewPrevious(currentData);
            }
        });
         
        gui.getViewAllBtn().setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                ArrayList<Data> allHunts = model.getAllHunts();
                
                gui.UpdateViewAll(allHunts);
            }
        });
    }
}
