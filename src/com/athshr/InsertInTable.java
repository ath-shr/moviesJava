package com.athshr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertInTable {
    public static void insert() {
        try{

            Connection conn = DriverManager.getConnection("jdbc:sqlite:movies.db");
            Statement statement= conn.createStatement();
            statement.execute("INSERT INTO movies VALUES('Eternals'    , 'Richard Madden'    , 2021 ,'Chloe Zhao'    )," +
                    "('The Materix' , 'Keanu Reevs'       , 1999 ,'Lana Wachowski')," +
                    "('Shershaah'   , 'Sidharth Malhotra' , 2021 ,'Vishnuvardhan' )," +
                    "('Sholay'      , 'Amitabh Bacchan'   , 1975 ,'Ramesh Sippy'  )," +
                    "('Kahaani'     , 'Vidya Balan'       , 2012 ,'Sujoy Ghosh'   )");
            statement.close();
            conn.close();

        }catch(SQLException e){
            System.out.println("Something Went wrong: "+ e.getMessage());
        }
    }
}
