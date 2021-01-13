package com.ludiaz.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Datasource {

    public static final String DB_NAME = "music.db";
    //For WINDOWS sqlite, the connection string must always have
    // jdbc:sqlite: + the file path to the database.
    public static final String CONNECTION_STRING = "jdbc:sqlite:C:\\Users\\myfak\\IdeaProjects\\Hello Wordl\\"
            + DB_NAME;

    public static final String TABLE_ALBUMS = "albums";
    public static final String COLUMN_ALBUM_ID = "_id";
    public static final String COLUMN_ALBUM_NAME = "name";
    public static final String COLUMN_ALBUM_ARTIST = "artist";

    public static final String TABLE_ARTISTS = "artists";
    public static final String COLUMN_ARTIST_ID = "_id";
    public static final String COLUMN_ARTIST_NAME = "name";

    public static final String TABLE_SONGS = "songs";
    public static final String COLUMN_SONG_TRACK = "track";
    public static final String COLUMN_SONG_TITLE = "title";
    public static final String COLUMN_SONG_ALBUM = "album";

    private Connection conn;
    public boolean open() {
        try {
            conn = DriverManager.getConnection(CONNECTION_STRING);
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return false;
        }
    }
    public void close() {
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Artist> queryArtists() {


        List artists = new ArrayList();
        try(Statement statement = conn.createStatement()) {
            ResultSet results = statement.executeQuery("SELECT * FROM " + TABLE_ARTISTS);

            while (results.next()) {
               Artist artist = new Artist();
               artist.setName(results.getString(COLUMN_ARTIST_NAME));
               artist.setId(results.getInt(COLUMN_ARTIST_ID));
               artists.add(artist);
            }
        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
            return null;
        }
        return artists;
    }



}
