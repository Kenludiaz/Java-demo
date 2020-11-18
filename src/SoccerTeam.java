public class SoccerTeam extends Team {
    public SoccerTeam(String name) {
        super(12, name);
    }

    @Override
    public void wonAgainst(Team other) {
        if (other.getClass() != this.getClass()) {
            System.out.println("This is a soccer team.");
            return;
        }
        this.wins++;
        other.loses++;
    }

    @Override
    public void tiedAgainst(Team other) {
        if (other.getClass() != this.getClass()) {
            System.out.println("This is a soccer team.");
            return;
        }
        this.ties++;
        other.loses++;
    }
}
