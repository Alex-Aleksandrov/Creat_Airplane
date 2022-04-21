package itAcademyy;

public class Main {

    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("German", 2015, 85, 786);
        Airplane airplane2 = new Airplane("Russia", 2011, 90, 586);
        Airplane.compareAirplanes(airplane1, airplane2);


        Player player1 = new Player(5);
        Player player2 = new Player(92);
        Player player3 = new Player(92);

        Player.info();

        Player player4 = new Player(92);
        Player player5 = new Player(92);
        Player player6 = new Player(92);

        Player.info();

        Player player7 = new Player(92);

        Player.info();

    }
}
