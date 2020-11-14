import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Album ghostDesert = new Album("Ghost Desert",
                "My Listless night", 3.25);
        ghostDesert.addSong("Woe is her", 4.20);
        Album christmasSpecial = new Album("Jingle Jungle",
                "My Last", 6.25);
        christmasSpecial.addSong("Woe to the world", 4.43);
        Album beachBirthday = new Album("Tequila",
                "Cali", 5.00);
        beachBirthday.addSong("America", 10.00);

//        ghostDesert.printSongs();
//        christmasSpecial.printSongs();
//        beachBirthday.printSongs();
//
        Playlist hotWorkout = new Playlist(beachBirthday, "America");
        hotWorkout.addSong(ghostDesert, "My Listless night");
        hotWorkout.addSong(beachBirthday, "Tequila");
        hotWorkout.addSong(christmasSpecial, "My Last");


        switch (action) {

        }

    }
}
