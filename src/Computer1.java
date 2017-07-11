/**
 * Created by Nathan Saleniuc on 7/10/2017.
 */
public class Computer1 extends Player {

    public Computer1() {
        super();
    }
    public Computer1(String userName, Roshambo choice) {
        super(userName, choice);
    }

    @Override
    public Roshambo generateRoshambo() {
        int compChoice = (int) (( Math.random() * 3) + 1);

        switch (compChoice) {
            case 1:
                System.out.println("Computer1: " + Roshambo.ROCK);
                return Roshambo.ROCK;
            case 2:
                System.out.println("Computer1: " + Roshambo.PAPER);
                return Roshambo.PAPER;
            case 3:
                System.out.println("Computer1: " + Roshambo.SCISSORS);
                return Roshambo.SCISSORS;
                default:
                    System.out.println("something went wrong");
        }

        return null;
    }
    //randomly select rock, paper, scissors

}
