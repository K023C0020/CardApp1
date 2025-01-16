public class Player {

    Card turn(Card[] cards) {
        int rnd = (int)(Math.random()*cards.length);
        return cards[rnd];
    }

}
