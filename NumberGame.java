import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chances = 6;
        int finals = 0;
        boolean playAgain = true;
        System.out.println("Welcome to Number Guess Game");
        System.out.println("Hey Buddy you have " + chances + " chances to win the game:");
        while (playAgain) {
            int random = getrandomN(1, 100);
            boolean guess = false;
            for (int i = 0; i < chances; i++) {
                System.out.println("chance" + (i + 1) + "   Enter your guess:");
                int user = sc.nextInt();
                if (user == random) {
                    guess = true;
                    finals += 1;
                    System.out.println("you won it");
                    break;
                } else if (user > random) {
                    System.out.println("Too High");
                } else {
                    System.out.println("Too Low ");
                }
            }

            if (guess == false) {
                System.out.println("Sorry buddy you lost the chances. The number is " + random);
            }
            System.out.println("Do you want to play again(yes/not)");
            String pA = sc.next();
            playAgain = pA.equalsIgnoreCase("yes");

        }
        System.out.println("here is your score:  " + finals);

    }

    public static int getrandomN(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);

    }

}
