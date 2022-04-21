package itAcademyy;

public class Player {
    int stamina;

    private final static int MAX_STAMINA = 100;
    private final static int MIN_STAMINA = 0;

    static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;
        countPlayers++;
    }

    public void run() {
        if (stamina > 0){
            stamina--;
        }
        if (stamina <= 0){
            countPlayers--;
        }
        return;
    }

    public static void info() {
        if (countPlayers < 6) {
            System.out.println("Команды неполные. На поле еще есть " + ( 6 - countPlayers) + " свободных мест");
        } else if (countPlayers > 6) {
            countPlayers = 6;
            System.out.println("На поле нет свободных мест");
        } else System.out.println("На поле нет свободных мест");
    }

    public int getStamina() {
        return stamina;
    }

    @Override
    public String toString() {
        return "Player{" +
                "stamina=" + stamina +
                ", MAX_STAMINA=" + MAX_STAMINA +
                ", MIN_STAMINA=" + MIN_STAMINA +
                '}';
    }
}