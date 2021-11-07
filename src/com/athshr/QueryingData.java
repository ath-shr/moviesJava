package com.athshr;

import java.sql.*;

public class QueryingData {
    public static void query() {

        try{
            Connection conn = DriverManager.getConnection("jdbc:sqlite:movies.db");
            Statement statement = conn.createStatement();
            statement.execute("SELECT * FROM movies");
            ResultSet results = statement.getResultSet();
            while(results.next()){
                System.out.println(results.getString("movie_name")+" , "+
                                   results.getString("actor_name")+" , "+
                                   results.getInt("release_year")+" , "+
                                   results.getString("director_name"));
            }

            results.close();
            statement.close();
            conn.close();

        }catch (SQLException e){
            System.out.println("Something Went wrong: "+ e.getMessage());
        }

    }
}
