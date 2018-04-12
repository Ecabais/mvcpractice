/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newmvcpractice;

import MVC.Controller;
import MVC.Data;
import MVC.GUI;
import MVC.Model;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author elyvic
 */
public class NewMVCPractice extends Application {
    
  
    @Override
    public void start(Stage primaryStage) {
        
       
        GUI gui = new GUI();
        Model model = new Model();
        Controller controller = new Controller(model, gui);
        
        
        
        
        Scene scene = new Scene(gui, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
