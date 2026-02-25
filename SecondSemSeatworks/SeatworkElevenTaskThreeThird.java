package SecondSemSeatworks;
import java.util.Random;
public class SeatworkElevenTaskThreeThird {
    public static void main(String[] args) {
        Random random = new Random();

        boolean isHeads = random.nextBoolean();

        if (isHeads) {
            System.out.println("HEADS");
        } else {
            System.out.println("TAILS");
        }
    }
}
