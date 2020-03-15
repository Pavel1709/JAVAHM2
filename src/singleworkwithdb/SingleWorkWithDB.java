/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleworkwithdb;

import java.io.IOException;
import java.util.ArrayList;
import static singleworkwithdb.Passengers.Start;

/**
 *
 * @author pmolchanov
 */
public class SingleWorkWithDB {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
      /*  
        Passengers p = new Passengers();
        Flights f= new Flights();
        Tickets t = new Tickets();
         
         
                
           // p.ID = new ArrayList<Integer>();
            p.Generation();
            f.Generation();
            for(String name:p.Ims) 
            System.out.println(name);
            for (String sam:f.planeName )
                System.out.println(sam);
        
        f.CreateDB();
        p.CreateDB();
        t.CreateDB();
              */
        JFrmeForDB j1=new JFrmeForDB();
        j1.setVisible(true);
        
}
    }
    

