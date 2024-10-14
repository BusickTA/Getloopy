import java.util.Random;
import java.util.Scanner;

public class dicerollgetloopy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        String playAgain;

        do {
            int die1 = 0;
            int die2 = 1;
            int die3 = 2;
            int counter = 0;

            System.out.println("Roll  Die1  Die2  Die3  Sum");
            System.out.println("______________________________");

            while (!(die1 == die2 && die2 == die3)) {
                counter++;
                die1 = rand.nextInt(1, 7);
                die2 = rand.nextInt(1, 7);
                die3 = rand.nextInt(1, 7);
                int sum = die1 + die2 + die3;
                System.out.println(counter + "     " + die1 + "      " + die2 + "      " + die3 + "     " + sum);
            }

            System.out.print("Do you want to play again? (Y/N): ");
            playAgain = scanner.nextLine();
        } while (playAgain.equalsIgnoreCase("Y"));

        scanner.close();
        System.out.println("Thank you for playing!");
    }}
