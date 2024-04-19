public class Game {
int rounds =3;
Player player1;
Player player2;

    public Game() {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start(Player player1, Player player2){
        int rounds =0;
        System.out.println("welcome to stone, scissor, paper");

    while (player1.countingPoints() || player2.countingPoints() == 3){
        rounds++;
        System.out.println("Runde: " + rounds);


        System.out.println("rock, scissor, paper");
        Sign s1 = player1.handSigns();


        Sign s2 = player2.handSigns();
        System.out.println("Spiller 2 har valgt " + player2.handSigns());



        if (s1 == s2){
            System.out.println("its a tie!");
        }else if (s1 == Sign.ROCK && s2 == Sign.SCISSORS ||
                s1 == Sign.SCISSORS && s2 == Sign.PAPER ||
                s1 == Sign.PAPER && s2 == Sign.ROCK) {
            System.out.println("Spiller 1 vandt!");
            player1.countingPoints();
        }else {
            System.out.println("Spiller 2 vandt!");
            player2.countingPoints();
        }
        System.out.println("Result:");
        System.out.println("Player1 " + player1.getPoints() + " points");
        System.out.println("Player2 " + player2.getPoints() + " points");
    }

}
}
