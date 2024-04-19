import java.util.Random;

public class Computerplayer extends Player{


    public Computerplayer(String name) {
        super(name);
    }

    @Override
    public Sign handSigns() {
        Random random = new Random();
        int choice = random.nextInt(3);
        switch (choice) {
            case 1:
                return Sign.ROCK;
            case 2:
                return Sign.SCISSORS;
            case 3:
                return Sign.PAPER;
        }
        return handSigns();
    }


}
