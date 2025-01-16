public class Game {
    Player p;
    Card[] cards;

    Game() {
        p = new Player();

        cards = new Card[52];
        String[] marks = {"♠","♥","♣","♦"};
        for (int i=0 ; i<52 ; i++) {
            for (int j=0 ; j<13 ; j++) {
                Card c = new Card();
            c.mark = marks[i];
            c.number = j+1;
            cards[i*13+j] = c;
            }
        }
    }

    void start() {
        Card c = p.turn(cards);
        c.open();
        judge(c);
    }

    void judge(Card c) {
        if (c.number >= 10) {
            System.out.println("勝ち！！");
        }
    }

}
