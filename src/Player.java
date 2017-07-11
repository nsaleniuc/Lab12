import java.util.Scanner;

/**
 * Created by Nathan Saleniuc on 7/10/2017.
 */
public abstract class Player {
    private String userName;

    private Roshambo choice;

    public Player(String userName, Roshambo choice) {
        this.userName = userName;
        this.choice = choice;
    }

    public Player() {

    }

    public String getUserName() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter name: ");
        userName = scan.nextLine();
        return userName;
    }

    public Roshambo getChoice() {
        Computer1 computer1 = new Computer1();
        Computer2 computer2 = new Computer2();
        HumanPlayer humanPlayer = new HumanPlayer();
        Roshambo userResult = null;
        Roshambo opponentResult = null;
        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to play against Computer1 or Computer2? (a/b)");
        String userChoice = scan.nextLine();

        if (userChoice.equalsIgnoreCase("a")) {
            userResult = humanPlayer.generateRoshambo();
            opponentResult = computer1.generateRoshambo();
        } else if (userChoice.equalsIgnoreCase("b")) {
            userResult = humanPlayer.generateRoshambo();
            opponentResult = computer2.generateRoshambo();
        } else {
            System.out.println("Invalid input");
        }
        System.out.println();
        if (userResult.equals(opponentResult)) {
            System.out.println("DRAW");
        } else if (userResult.equals(Roshambo.ROCK) && (opponentResult.equals(Roshambo.SCISSORS))) {
            System.out.println("YOU WIN");
        } else if (userResult.equals(Roshambo.PAPER) && (opponentResult.equals(Roshambo.ROCK))) {
            System.out.println("YOU WIN");
        } else if (userResult.equals(Roshambo.SCISSORS) && (opponentResult.equals(Roshambo.PAPER))) {
            System.out.println("YOU WIN");
        } else {
            System.out.println("YOU LOSE");
        }
        return choice;
    }
    public abstract Roshambo generateRoshambo();


}
