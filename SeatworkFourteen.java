import java.util.Scanner;

public class SeatworkFourteen {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        class Motorcycle {
            String make;
            String color;
            boolean engineState = false;

            void starEngine() {
                if(engineState) {
                    System.out.println("The engine is already on.");
                } else {
                    System.out.println("The engine is now on.");
                    engineState = true;
                }
            }

            void showAtts() {
                System.out.println("This mototrcycle is a " + color + " " + make);
                System.out.println("Engine State: " + (engineState ? "on" : "off"));
            }
        }

        Motorcycle m = new Motorcycle();
        m.make = "kawasaki 1000cc";
        m.color = "blue";
        
        System.out.println("Type 'on' to start the engine, or 'show' to view attributes: ");
        System.out.println("engine state is off.");
        System.out.print("Command: ");
        String command = scnr.nextLine();

        if (command .equalsIgnoreCase("on")) {
            System.out.println("Engine is starting...");
            m.starEngine();
        } else if (command.equalsIgnoreCase("show")) {
            m.showAtts();
        } else {
            System.out.println("Unknown command.");
        }

        scnr.close();
    }
}