package FirstSemSeatworks;
import java.util.Scanner;

public class SeatworkFifthteenP2 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter your score: ");
        double score = scnr.nextDouble();

        if (score >= 90.1) {
            System.out.println("Your grade is A!!");
        } else if (score >= 80.1) {
            System.out.println("Your grade is B!!");
        } else if (score >= 70.1) {
            System.out.println("Your grade is C!!");
        } else if (score >= 60.1) {
            System.out.println("Your grade is D!!");
        } else {
            System.out.println("Your grade is F!! Failed");
        }
    } 
}