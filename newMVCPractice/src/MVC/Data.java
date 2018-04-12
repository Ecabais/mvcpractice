/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import java.io.Serializable;

/**
 *
 * @author elyvic
 */
public class Data {
    private String hunt;
    private String chain;

    public Data() {
    }

    
    
    public Data(String hunt, String chain) {
        this.hunt = hunt;
        this.chain = chain;
    }

    /**
     * @return the hunt
     */
    public String getHunt() {
        return hunt;
    }

    /**
     * @param hunt the hunt to set
     */
    public void setHunt(String hunt) {
        this.hunt = hunt;
    }

    /**
     * @return the chain
     */
    public String getChain() {
        return chain;
    }

    /**
     * @param chain the chain to set
     */
    public void setChain(String chain) {
        this.chain = chain;
    }
    
   
            
    
    
}
