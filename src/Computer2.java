/**
 * Created by Nathan Saleniuc on 7/10/2017.
 */
public class Computer2 extends Player {

    public Computer2() {

    }

    public Computer2(String userName, Roshambo choice) {
        super(userName, choice);
    }

    @Override
    public Roshambo generateRoshambo() {
        System.out.println("Computer2: " + Roshambo.ROCK);
        return Roshambo.ROCK;
    }
    //will always select rock

}
