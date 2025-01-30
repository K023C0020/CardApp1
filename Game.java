public class Game {
    Player p;
    Card[] cards;

    Game() {
        p = new Player();

        cards = new Card[52];
        String[] marks = {"♠","♥","♣","♦"};
        for (int i=0 ; i<4 ; i++) {
            for (int j=0 ; j<13 ; j++) {
                Card c = new Card();
                c.mark = marks[i];
                c.number = j+1;
                cards[i*13+j] = c;
            }
        }
    }

    void start() {
        Card c1 = p.turn(cards);
        c1.open();
        Card c2 = p.turn(cards);
        String ans = p.answer();
        judge(c1, c2, ans);
    }

    void judge(Card c1, Card c2, String ans) {
        c2.open();
        if ((ans.equals("h") && c1.number < c2.number) || (ans.equals("l") && c1.number > c2.number) ) {
            System.out.println("勝ち！！");
        } else if (c1.number==c2.number) {
            System.out.println("引き分け");
        } else {
            System.out.println("負け");
        }
    }

}
