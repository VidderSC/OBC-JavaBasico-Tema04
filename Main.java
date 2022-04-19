package poo.ejercicioPoo;

public class Main {

    public static void main(String[] args) {

        SmartPhone appleIphone = new SmartPhone("Apple", "iPhone 13", "Deep Space", 6.1, true, "Lightning", false, 12, 256);

        SmartWatch appleWatch = new SmartWatch("Apple", "Watch 6", "Space Gray", 4.2, false, "Wireless", "Leather", true);

        System.out.println(appleIphone);
        System.out.println(appleWatch);
    }
}
