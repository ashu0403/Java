
public class Game {
    static int score = 100;

    public void display() {
        System.out.println(score);
    }

    public static void main(String[] args) {
        Game game = new Game();
        Game game1 = new Game();
        game.score = 200;
        game.display();
        game1.display();
    }
}
