import java.util.ArrayList;

public class Album {
    private String albumName;
    private ArrayList<Song> Songs = new ArrayList<Song>();

    public ArrayList<Song> getSongs() {
        return Songs;
    }

    public Album(String albumName, String songTitle, double songDuration) {
        this.albumName = albumName;
        Song firstSong = new Song(songTitle, songDuration);
        Songs.add(firstSong);
    }
    public void addSong(String songTitle, double songDuration) {
        Song newSong = new Song(songTitle, songDuration);
        if (this.Songs.contains(newSong)) {
            System.out.println("Sorry this song is already in the album.");
            return;
        }
        this.Songs.add(newSong);
    }

    public void printSongs() {
        if (isEmpty()) {
            return;
        }
        System.out.println("Current Album " + albumName);
        for (Song item:
             Songs) {
            System.out.println(item.getTitle() +" "+ item.getDuration());
        }
    }

    public boolean isEmpty() {
        if (Songs.isEmpty()) {
            return true;
        }
        return false;
    }

    public boolean contains(Song song) {
        if (this.Songs.contains(song)) {
            return true;
        }
        return false;
    }

    public boolean exists(String songName) {
        if (this.Songs.isEmpty()) {
            return false;
        }
        for (Song item :
                Songs) {
            if (item.getTitle().toLowerCase().equals(songName.toLowerCase())) {
                return true;
            }
        }
        return true;
    }

    public double findSongDuration(String songName) {
        for (Song item :
                Songs) {
            if (item.getTitle().equals(songName)) {
                return  item.getDuration();
            }
        }
        return -1;
    }
}
