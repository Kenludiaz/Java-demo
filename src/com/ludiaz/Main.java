package com.ludiaz;

import com.ludiaz.model.Datasource;

public class Main {
    public static void main(String[] args) {
        Datasource datasource = new Datasource();
        if (!datasource.open()) {
            System.out.println("Cant open data source");
            return;
        }
    }
}
