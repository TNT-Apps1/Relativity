package DbHelper;


import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Grant Thompson <adin.tocc@gmail.com>
 * ITDEV 140 THUR EVE ASSIGNMENT #9
 */
public class Db_Helper {
    
    Connection conn;

    public Db_Helper() {
       
    }
    
   /**
    * 
    * @param arg1 connection from DataBaseConnection
    * @param arg2 ArrayList reference
    * @throws IOException
    * @throws ClassNotFoundException
    * @throws SQLException 
    */
    public void buildIt(Connection arg1, ArrayList arg2) throws IOException, ClassNotFoundException, SQLException{
        
        conn = arg1;
        Statement stat2 = null;
        //DataBaseConnection.init(args[0]);
    
    try{  // setsup an object of the statment interface by using a method of the Connection object
        stat2 = conn.createStatement();
        //Creates a table
        stat2.executeUpdate("CREATE TABLE AstronautTable (AstroFName CHAR(20), AstroLName CHAR(20), ApolloMissionNumber CHAR(20), YearOfMission CHAR(4))");
   
        //inserts data into the table created
        stat2.executeUpdate("INSERT INTO AstronautTable VALUES ('Neil','Armstrong','Apollo 11','1969')");
        stat2.executeUpdate("INSERT INTO AstronautTable VALUES ('Buzz','Aldrin','Apollo 11','1969')");
        stat2.executeUpdate("INSERT INTO AstronautTable VALUES ('Pete','Conrad','Apollo 12','1969')");
        stat2.executeUpdate("INSERT INTO AstronautTable VALUES ('Alan','Bean','Apollo 12','1969')");
        stat2.executeUpdate("INSERT INTO AstronautTable VALUES ('Alan','Shepard','Apollo 14','1971')");
        stat2.executeUpdate("INSERT INTO AstronautTable VALUES ('Edgar','Mitchell','Apollo 14','1971')");
        stat2.executeUpdate("INSERT INTO AstronautTable VALUES ('David','Scott','Apollo 15','1971')");
        stat2.executeUpdate("INSERT INTO AstronautTable VALUES ('James','Irwin','Apollo 15','1971')");
        stat2.executeUpdate("INSERT INTO AstronautTable VALUES ('John','Young','Apollo 16','1972')");
        stat2.executeUpdate("INSERT INTO AstronautTable VALUES ('Charles','Duke','Apollo 16','1972')");
        stat2.executeUpdate("INSERT INTO AstronautTable VALUES ('Eugene','Cernan','Apollo 17','1972')");
        stat2.executeUpdate("INSERT INTO AstronautTable VALUES ('Harrison','Schmitt','Apollo 17','1972')");
            
        //runs a query to create a new object of the ResultSet 
       ResultSet resultAstronaut = stat2.executeQuery("SELECT * FROM AstronautTable");  //NOTE: executeQuery to run SELECT statements

        // loops through the result set to find each print out each row
       while(resultAstronaut.next())
       {
          //places column value into a variable for entire row
           Astronaut asrtonaut = new Astronaut();
           asrtonaut.setFirstName(resultAstronaut.getString("AstroFName"));
           asrtonaut.setLastName(resultAstronaut.getString("AstroLName"));
           asrtonaut.setMission(resultAstronaut.getString("ApolloMissionNumber"));
           asrtonaut.setYearOfMission(resultAstronaut.getString("YearOfMission"));
           System.out.println(asrtonaut.getFirstName());
           arg2.add(asrtonaut);
        }//end while
      }
        
      finally
      {
         if(stat2 != null)
            stat2.execute("DROP TABLE AstronautTable");//closes database connection
          conn.close();
      }  
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
