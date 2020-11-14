import java.util.LinkedList;

public class Playlist {
    LinkedList<Song> playList = new LinkedList<Song>();

    public Playlist(Album album, String firstSong) {
        if (album.isEmpty()) {
            System.out.println("Entered album is empty.");
            return;
        }
        addSong(album, firstSong);
    }

    public void addSong(Album addFrom, String newSongName) {
        if (addFrom.exists(newSongName)) {
            double songDuration = addFrom.findSongDuration(newSongName);
            playList.add(new Song(newSongName, songDuration));
            return;
        }
        System.out.println("Song is not in album.");
    }

    public void printPlayList() {
        if (this.playList.isEmpty()) {
            System.out.println("Playlist is empty.");
            return;
        }
        for (Song item : this.playList) {
            System.out.println(item.getTitle() + " " + item.getDuration());
        }
    }


}
