import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team>  {
    ArrayList<T> Teams = new ArrayList<>();

    void addTeam(T newTeam) {
        Teams.add(newTeam);
    }

    public void printRankings() {
        for (int i = 0; i < Teams.size(); i++) {
            System.out.println(Teams.get(i).getName());
        }
    }

    public void showLeagueTable() {
        Collections.sort(Teams);
        int counter = Teams.size();
        System.out.println("Rankings: ");
        for (T team : Teams) {
            System.out.println(team.getName() + ": " + counter);
            counter--;
        }
    }


}
