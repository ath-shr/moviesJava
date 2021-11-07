package com.athshr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
    public static void create() {

        try {
            Connection conn= DriverManager.getConnection("jdbc:sqlite:movies.db");
            Statement statement = conn.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS movies(movie_name TEXT, actor_name TEXT, release_year INTEGER, director_name TEXT)");
            statement.close();
            conn.close();

        }catch(SQLException e){
            System.out.println("Something Went wrong: "+ e.getMessage());
        }

    }
}
