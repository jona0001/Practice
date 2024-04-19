public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        Player player1 = new Humanplayer("humanPlayer");
        Player player2 = new Computerplayer("ComputerPlayer");
        game.start(player1, player2);
    }
}
