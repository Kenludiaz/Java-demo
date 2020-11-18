
public class Main {
    public static void main(String[] args) {
        League<SoccerTeam> SoccerLeague = new League<>();
        SoccerTeam Mudslingers = new SoccerTeam("Mudslingers");
        SoccerTeam Netters = new SoccerTeam("Netters");
        SoccerTeam Brazilers = new SoccerTeam("Brazilers");
        BasketballTeam Hoopers = new BasketballTeam("Hoopers");

        SoccerLeague.addTeam(Mudslingers);
        SoccerLeague.addTeam(Netters);
        SoccerLeague.addTeam(Brazilers);
//        SoccerLeague.addTeam(Hoopers);
//        SoccerLeague.addTeam("Hello");
        Mudslingers.wonAgainst(Hoopers);
        Mudslingers.wonAgainst(Netters);
        Netters.wonAgainst(Mudslingers);
        Mudslingers.tiedAgainst(Netters);

        SoccerLeague.showLeagueTable();
    }

}
