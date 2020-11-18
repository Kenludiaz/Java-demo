public abstract class Team implements Comparable<Team> {
    protected int size;
    protected String name;
    protected int wins;
    protected int loses;
    protected int ties;

    public Team(int size, String name) {
        this.size = size;
        this.name = name;
        wins = 0;
        loses = 0;
        ties = 0;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public int getWins() {
        return wins;
    }

    public int getLoses() {
        return loses;
    }

    public int getTies() {
        return ties;
    }

    abstract void wonAgainst(Team other);
    abstract void tiedAgainst(Team other);

    @Override
    public int compareTo(Team o) {
        if (this.getWins() == o.getWins()) {
            return 0;
        } else if (this.getWins() > o.getWins()) {
            return 1;
        }
        return -1;
    }
}
