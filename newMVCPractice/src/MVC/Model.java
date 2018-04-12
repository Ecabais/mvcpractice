/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author elyvic
 */
public class Model {
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Sunichi07!";
    private static final String CONN_STRING = "jdbc:mysql://localhost:3306/citation";
    
    private Connection conn = null; 
    private ResultSet Rs = null;
    private Statement stmt = null;
    
    ArrayList<Data> huntDB = new ArrayList<>();
    GUI gui = new GUI();
    Data currentData = new Data();
    
   
    
    public void setCurrentHunt(Data currentData){
        this.currentData = currentData;
        Database();
        
        
    }
    
    public Data getCurrentHunt(){
        return currentData;
    }
    
    public ArrayList<Data> getAllHunts(){
        return huntDB;
    }
    
    
    public void Database(){
           
           
           try{
               conn = DriverManager.getConnection(CONN_STRING, USERNAME,PASSWORD);
               stmt = conn.createStatement();
               Rs = stmt.executeQuery("SELECT * From hunt.pokemon;");
               String pokemon = currentData.getHunt();
               String chain = currentData.getChain();
               String sql = "INSERT INTO hunt.pokemon " + " (Pokemon, Chain)" + "VALUES ('"+pokemon+"','"+chain+"')";
               
               
               while(Rs.next()){
                   System.out.println(Rs.getString("pokemon")+ ", " + Rs.getString("chain"));
                   String pokemonDB = Rs.getString("pokemon");
                   String chainDB = Rs.getString("chain");
                   currentData = new Data(pokemonDB, chainDB);
                   huntDB.add(currentData);
               
               }
               
               stmt.executeUpdate(sql);
               
           }
           catch(Exception exc){
               exc.printStackTrace();
           }
           
           
           
               
    

    
    }
 
}
