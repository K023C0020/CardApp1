import java.util.Scanner;

public class Player {

    Card turn(Card[] cards) {
        int rnd = (int)(Math.random() * cards.length);
        return cards[rnd];
    }

    String answer() {
        System.out.print("High(h) or Low(l)?");
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }
}
