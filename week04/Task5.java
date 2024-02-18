package week04;
import java.util.Random;
import java.util.Scanner;
public class Task5 {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Task5 game = new Task5();
        int rounds = scan.nextInt();
        game.playRounds(rounds);
        scan.close();
    }
    public Random random;
    public Task5() {
        random = new Random();
    } 
    public int rollDice() {
        int die1 = random.nextInt(6) + 1;
        int die2 = random.nextInt(6) + 1;
        return die1 + die2;
    }

    public boolean comeOutRoll(int roll) {
        return roll == 7 || roll == 11;
    }

    public boolean crapsOut(int roll) {
        return roll == 2 || roll == 3 || roll == 12;
    }
    public boolean playRound() {
        int roll = rollDice();
        if (comeOutRoll(roll)) {
            System.out.println("Come-out roll: " + roll);
            System.out.println("Player wins!");
            return true;
        } else if (crapsOut(roll)) {
            System.out.println("Come-out roll: " + roll);
            System.out.println("Player loses!");
                return false;
        } else {
            System.out.println("Point established: " + roll);
            int point = roll;
            while (true) {
                roll = rollDice();
                System.out.println("Next roll: " + roll);
                if (roll == point) {
                    System.out.println("Player wins!");
                    return true;
                } else if (roll == 7) {
                    System.out.println("Seven out! Player loses!");
                    return false;
                }
            }
        }
    }
    public void playRounds(int N) {
        for (int i = 1; i <= N; i++) {
            System.out.println("Round " + i + ":");
            boolean result = playRound();
            System.out.println("Round " + i + ": " + (result ? "Player wins!" : "Player loses!"));
            System.out.println();
        }
    }


} 
