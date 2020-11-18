public class BasketballTeam extends Team {
    public BasketballTeam(String name) {
        super(5, name);
    }
    public void wonAgainst(Team other) {
        if (other.getClass() != this.getClass()) {
            System.out.println("This is a basketball team.");
            return;
        }
        this.wins++;
        other.loses++;
    }

    @Override
    public void tiedAgainst(Team other) {
        if (other.getClass() != this.getClass()) {
            System.out.println("This is a basketball team.");
            return;
        }
        this.ties++;
        other.loses++;
    }
}
