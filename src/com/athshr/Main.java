package com.athshr;

public class Main {

    public static void main(String[] args) {

        CreateTable c = new CreateTable();
        c.create();

        InsertInTable i= new InsertInTable();
        i.insert();

        QueryingData q = new QueryingData();
        q.query();


    }
}
