class Motorcycle {
    String make;
    String color;
    boolean engineState = false;

    void showAtts() {
        System.out.println("Make: " + make);
        System.out.println("Color: " + color);
        System.out.println("Engine state: " + (engineState ? "On" : "Off"));
    }

    void startEngine() {
        if (engineState == true) {
            System.out.println("The engine is already on.");
        } else {
            engineState = true;
            System.out.println("The engine is now on.");
        }
    }
}

public class SeatworkFourteen {
    public static void main(String args[]) {
        Motorcycle m = new Motorcycle();
        m.make = "Yamaha RZ350";
        m.color = "Yellow";

        System.out.println("Calling showAtts...");
        m.showAtts();
        System.out.println("--------");
        System.out.println("Starting engine...");
        m.startEngine();
        System.out.println("--------");

        System.out.println("Calling showAtts...");
        m.showAtts();
        System.out.println("--------");
        System.out.println("Starting engine...");
        m.startEngine();
    }
}
