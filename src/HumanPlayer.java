import java.util.Scanner;

/**
 * Created by Nathan Saleniuc on 7/10/2017.
 */
public class HumanPlayer extends Player {

    public HumanPlayer(String userName, Roshambo choice) {
        super(userName, choice);

    }
    public HumanPlayer() {

    }
    @Override
    public Roshambo generateRoshambo() {
        Scanner scan = new Scanner(System.in);
        String userName = getUserName();
        System.out.println("Please choose rock, paper, or scissors (R/P/S)");
        String choice = scan.nextLine();
        switch (choice) {
            case "R":
            case "r":
                System.out.println(userName + ": " + Roshambo.ROCK);
                return Roshambo.ROCK;
            case "P":
            case "p":
                System.out.println(userName + ": " + Roshambo.PAPER);
                return Roshambo.PAPER;
            case "S":
            case "s":
                System.out.println(userName + ": " + Roshambo.SCISSORS);
                return Roshambo.SCISSORS;
            default:
                System.out.println("Something went terribly wrong");
        }
        return null;
    }
}
