/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleworkwithdb;

import com.healthmarketscience.jackcess.ColumnBuilder;
import com.healthmarketscience.jackcess.DataType;
import com.healthmarketscience.jackcess.Table;
import com.healthmarketscience.jackcess.TableBuilder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 *
 * @author pmolchanov
 */
public class Tickets {
     ArrayList <Integer>  ID;
     ArrayList <Integer>  IDpass;
     ArrayList <Integer>  IDflights;
int i;

 public void CreateDB() throws IOException {
     Flights f = new Flights();
Passengers p = new Passengers();
     ID=new ArrayList<Integer>();
       IDpass=new ArrayList<Integer>();
         IDflights=new ArrayList<Integer>();
 // Sring DBName="newDB.accdb";
        // newDB=DatabaseBuilder.create(Database.FileFormat.V2010,new File(DBName));
        TableBuilder TB=  new TableBuilder("Tickets");
        TB.addColumn(new ColumnBuilder("ID",DataType.INT));
        TB.addColumn(new ColumnBuilder("IDpass",DataType.INT));
        TB.addColumn(new ColumnBuilder("IDflights",DataType.INT));
       // TB.addColumn(new ColumnBuilder("Sudar",DataType.TEXT));
        Table tickets = TB.toTable(Flights.newDB);
        HashMap<String,Object> m = new HashMap<String,Object>();
       Random generator = new Random();
int randomIndex = generator.nextInt(100);
//return ID.get(randomIndex);
      
     
  
        for (i=0;i<100;i++) {
                // int z=p.radomizer1();
        m.put("ID", i);
 
        
          
       m.put("IDpass",Passengers.ID.get(99-i));
     //  Passengers.ID.remove(z);
        //teremok.addRowFromMap(m);
        
       
        m.put("IDflights",Flights.ID.get(f.radomizer()) );
        tickets.addRowFromMap(m);
         }
}
}    

