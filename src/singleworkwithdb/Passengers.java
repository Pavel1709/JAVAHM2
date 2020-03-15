
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
import org.apache.commons.math3.distribution.*;
import static singleworkwithdb.Flights.ID;
import static singleworkwithdb.Flights.Start;
import static singleworkwithdb.Flights.Start2;

public class Passengers {
   static ArrayList <Integer>  ID;
   ArrayList<String> Ims; 
   ArrayList<String> Fams; 
   String[] Imena;
   String[] Familii;
   int i;
   int j;
   int k;
  static double r;
   public  static double Start(){
         WeibullDistribution W =new WeibullDistribution(1,4.2);
        return W.sample();
        
        
}
   public void Generation() {
       
    Imena=new String[36];
         Imena[0]="Sergey";
         Imena[1]="Anton";
         Imena[2]="Stas";
         Imena[3]="Eugeniy";
         Imena[4]="Slava";
         Imena[5]="Anna";
         Imena[6]="Pavel";
         Imena[7]="Alina";
         Imena[8]="Yaroslav";
         Imena[9]="Alexandr";
         Imena[10]="Vladimir";
         Imena[11]="Nikita";
         Imena[12]="Ekaterina";
         Imena[13]="Ksenia";
         Imena[14]="Lubov'";
         Imena[15]="Antonina";
         Imena[16]="Valentin";
         Imena[17]="Dmitriy";
         Imena[18]="Yulia";
         Imena[19]="Tatiana";
         Imena[20]="Elena";
         Imena[21]="Alena";
         Imena[22]="Katerina";
         Imena[23]="Anastasia";
         Imena[24]="Brandon";
         Imena[25]="Clark";
         Imena[26]="Bil";
         Imena[27]="Stiven";
         Imena[28]="Arnold";
         Imena[29]="Eruard";
         Imena[30]="Afanasiy";
         Imena[31]="Alex";
         Imena[32]="Bob";
         Imena[33]="Sten";
         Imena[34]="Mihail";
         Imena[35]="Aleftina";
         
                 
         //Imena[20]="Alexandra";
        Familii=new String[36];
         Familii[0]="Alexandrov[a]";
         Familii[1]="Molchanov[a]";
         Familii[2]="Fatkullin[a]";
         Familii[3]="Ibragimov[a]";
         Familii[4]="Stankevich";
         Familii[5]="Bortich";
         Familii[6]="Smith";
         Familii[7]="Antonov[a]";
         Familii[8]="Ul'yanov[a]";
         Familii[9]="Vasil'ev[a]";
         Familii[10]="Semenovich";
         Familii[11]="Andropovich";
         Familii[12]="Kondratov[a]";
         Familii[13]="Miluchihin[a]";
         Familii[14]="Doncov[a]";
         Familii[15]="Weibull";
         Familii[16]="Kalmagorov[a]";
         Familii[17]="Solzhenicin[a]";
         Familii[18]="Sinicin[a]";
         Familii[19]="Vorob'yov[a]";
         Familii[20]="Levin[a]";
         Familii[21]="Artemov[a]";
         Familii[22]="Alexeev[a]";
         Familii[23]="Altuf'ev[a]";
         Familii[24]="Mishin[a]";
         Familii[25]="Minin[a]";
         Familii[26]="Borovkov[a]";
         Familii[27]="Petuhov[a]";
         Familii[28]="Poroshkov[a]";
         Familii[29]="Stolov[a]";
         Familii[30]="Telephonov[a]";
         Familii[31]="Pechkin[a]";
         Familii[32]="Moshkin[a]";
         Familii[33]="Koshkin[a]";
         Familii[34]="Tarabanov[a]";
         Familii[35]="Uzurpatov[a]";
//         Familii[20]="Astaf'ev";
       ID = new ArrayList<Integer>();
       Ims= new ArrayList<String>();
       Fams = new ArrayList<String>();
            //while (i<100) {
        for (i=0;i<100;i++) {
             ID.add(i);
             //Ims.add[Imena[1]];
             
        }
        //while (j<100) {
        for (j=0;j<100;j++) {
            Ims.add(Imena[(int) Start()]);
            
        } 
        for (k=0;k<100;k++) {
            Fams.add(Familii[(int) Start()]);
            
        }
                
        }
    public void CreateDB() throws IOException {
        Flights f = new Flights();
  //String DBName="newDB2.accdb";
      //  Database newDB=DatabaseBuilder.create(Database.FileFormat.V2010,new File(DBName));
        TableBuilder TB=  new TableBuilder("Passengers");
        TB.addColumn(new ColumnBuilder("ID",DataType.INT));
        TB.addColumn(new ColumnBuilder("Imya",DataType.TEXT));
        TB.addColumn(new ColumnBuilder("Familiya",DataType.TEXT));
       // TB.addColumn(new ColumnBuilder("Sudar",DataType.TEXT));
        Table passes = TB.toTable(Flights.newDB);
        HashMap<String,Object> m = new HashMap<String,Object>();
       
       // double pr =145.3;
        for (i=0;i<100;i++) {
        m.put("ID", i);
        //teremok.addRowFromMap(m);
        
          
        m.put("Imya",Ims.get(i));
        //teremok.addRowFromMap(m);
        m.put("Familiya",Fams.get(i) );
       
        //m.put("AmountOfPass", (int) Start2()+15);
        passes.addRowFromMap(m);
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
      public int radomizer1() {
          int m=100;
      Random generator = new Random();
int randomIndex = generator.nextInt(m);

return ID.get(randomIndex);

  }
   }

