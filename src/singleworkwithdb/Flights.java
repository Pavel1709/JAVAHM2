/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleworkwithdb;

import com.healthmarketscience.jackcess.ColumnBuilder;
import com.healthmarketscience.jackcess.DataType;
import com.healthmarketscience.jackcess.Database;
import com.healthmarketscience.jackcess.DatabaseBuilder;
import com.healthmarketscience.jackcess.Table;
import com.healthmarketscience.jackcess.TableBuilder;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import org.apache.commons.math3.distribution.WeibullDistribution;


/**
 *
 * @author pmolchanov
 */
public class Flights {
    static ArrayList <Integer>  ID;
   static ArrayList <Integer>  AmountOfPass;
   ArrayList<String> planeName;
   String[] planes;
   int i;
   int j;
   public void Generation() { 
       ID=new ArrayList();
       AmountOfPass=new ArrayList();
       planeName=new ArrayList();
planes = new String[26];
 planes[1] = "Boeing 737";
 planes[2] = "Boeing 343";
 planes[3] = "Boeing 157";
 planes[4] = "Jet 777";
 planes[5] = "Superjet";
 planes[6] = "Tu 134";
 planes[7] = "Air Force One";
 planes[8] = "AH-225";
 planes[9] = "AH-344";
 planes[10] = "Jet 656";
  planes[11] = "Jet LUX";
   planes[12] = "LMS-M-S-L 4";
    planes[13] = "IL-76";
     planes[14]="MiG-3";
      planes[15]="MI-24P";
       planes[16]="I16";
       planes[17]="U40";
       planes[18]="U50";
       planes[19]="U190";
       planes[20]="M-LX12";
       planes[21]="Jet LIZZARD";
       planes[22]="Superjet 2";
       planes[23]="Boeing 252";
       planes[24]="Boeing 688";
       planes[25]="IL-90";
 planes[0] = "Tupolev 100";
  for (i=0;i<100;i++) {
             ID.add(i);      
        }
   for (i=0; i<100; i++) {
             AmountOfPass.add((int) Start());      
        }
  for (j=0;j<100;j++) {
            planeName.add(planes[(int) Start()]);
            
        }
}
  public  static double Start(){
         WeibullDistribution W =new WeibullDistribution(1,3.5);
        return W.sample();
        
        
}
  public  static double Start2(){
         WeibullDistribution W =new WeibullDistribution(3,5);
        return W.sample();
        
        
}
  static Database newDB;
  public void CreateDB() throws IOException {
  String DBName="newDB.accdb";
         newDB=DatabaseBuilder.create(Database.FileFormat.V2010,new File(DBName));
        TableBuilder TB=  new TableBuilder("Flights");
        TB.addColumn(new ColumnBuilder("ID",DataType.INT));
        TB.addColumn(new ColumnBuilder("Plane Name",DataType.TEXT));
        TB.addColumn(new ColumnBuilder("AmountOfPass",DataType.INT));
       // TB.addColumn(new ColumnBuilder("Sudar",DataType.TEXT));
        Table flights = TB.toTable(newDB);
        HashMap<String,Object> m = new HashMap<String,Object>();
       
       // double pr =145.3;
        for (i=0;i<100;i++) {
        m.put("ID", i);
        //teremok.addRowFromMap(m);
        
          
        m.put("Plane Name",planeName.get(i));
        //teremok.addRowFromMap(m);
        
       
        m.put("AmountOfPass", AmountOfPass.get(i)+15);
        flights.addRowFromMap(m);
         }
       // m.put("Sudar", "Pasha");
        
        //HashMap<String,Object> m1 = new HashMap<String,Object>();
       /*
        i =2 ;
        pr =122.2;
        m.put("ID", i);
        m.put("Dish", "Borsh");
        m.put("Price", pr);
        m.put("Sudar", "Nina");
        teremok.addRowFromMap(m);
        */
}
  public int radomizer() {
      Random generator = new Random();
int randomIndex = generator.nextInt(100);
return ID.get(randomIndex);
  }
}
