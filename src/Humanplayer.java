import java.util.Scanner;

public class Humanplayer extends Player{


    public Humanplayer(String name) {
        super(name);
    }

    @Override
    public Sign handSigns() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("chose a sign: (1) rock, (2) Scissors, (3) Paper");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                return Sign.ROCK;
            case 2:
                return Sign.SCISSORS;
            case 3:
                return Sign.PAPER;
            default:
                System.out.println("invalid, try again.");

        }
        return handSigns();

    }
}
