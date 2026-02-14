package Second.Sem.Seatworks;

public class SeatworkSevenThirdPart1 {
    public static void main(String[] args) {
        int number1 = 20;
        int number2 = 0;

        try {
            int result = number1 / number2;
        } catch (ArithmeticException e) {
            System.out.println("Built-in Exception: Error");
        }

        System.out.println("Program continues running...");
    }
}