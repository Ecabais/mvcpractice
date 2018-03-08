/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import java.util.ArrayList;

/**
 *
 * @author elyvic
 */
public class Model {
    ArrayList<Data> huntDB = new ArrayList<>();
    Data currentData = new Data();
    
    public void setCurrentHunt(Data currentData){
        this.currentData = currentData;
        huntDB.add(currentData);
        
    }
    
    public Data getCurrentHunt(){
        return currentData;
    }
    
    
    
}
