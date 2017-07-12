import java.util.Scanner;

/**
 * Created by Nathan Saleniuc on 7/10/2017.
 */
public class RoshamboApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Rock Paper Scissors");
        String cont = "y";
        while (cont.equalsIgnoreCase("y")) {
            HumanPlayer humanPlayer = new HumanPlayer();
            humanPlayer.getChoice();
            System.out.println("Play again? y/n");
            cont = scan.nextLine();
        }
        System.out.println("goodbye");
    }
}




