package com.ludiaz;

import com.ludiaz.model.Artist;
import com.ludiaz.model.Datasource;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Datasource datasource = new Datasource();
        if (!datasource.open()) {
            System.out.println("Cant open data source");
            return;
        }
        List<Artist> artists = datasource.queryArtists();
        if (artists == null) {
            System.out.println("No artists");
            return;
        }
        for (Artist artist : artists) {
            System.out.println("ID " + artist.getId() + " Name " + artist.getName());
        }

        datasource.close();
    }
}
