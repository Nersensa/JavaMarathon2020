package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        Player player1 = new Player(random.nextInt(90, 100));
        Player player2 = new Player(random.nextInt(90, 100));
        Player player3 = new Player(random.nextInt(90, 100));
        Player player4 = new Player(random.nextInt(90, 100));
        Player player5 = new Player(random.nextInt(90, 100));
        Player.info();
        Player player6 = new Player(random.nextInt(90, 100));
        Player.info();
        Player player7 = new Player(random.nextInt(90, 100));
        Player.info();

        for (int i = 1; i <= 110; i++) {
            player1.run();
        }
        Player.info();

    }
}

class Player {
    private int stamina;
    public final int MAX_STAMINA = 100;
    public final int MIN_STAMINA = 0;
    public static int countPlayers = 0;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) {
            countPlayers += 1;
        }
    }

    void run() {
        if (this.stamina > 1) {
            this.stamina -= 1;
            System.out.println(this.stamina);
            System.out.println("player running");
        }
        if (this.stamina == MIN_STAMINA+1) {
            this.stamina = MIN_STAMINA;
            countPlayers -= 1;
            System.out.println("player outside");
        }

    }

    public static void info() {
        if (countPlayers == 6) {
            System.out.println("На поле нет свободных мест");
        } else {
            System.out.println("Команды не полные. На поле есть еще " + (6 - countPlayers) + " свободных мест");
        }
    }

    public int getStamina() { return stamina; }
}