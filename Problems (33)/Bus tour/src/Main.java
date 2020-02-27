import java.util.*;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var busHeight = scanner.nextInt();
        var numberOfBridges = scanner.nextInt();
        var crashed = false;

        for (int i = 1; i <= numberOfBridges; i++) {
            var bridgeHeight = scanner.nextInt();
            if (busHeight >= bridgeHeight) {
                System.out.println(String.format("Will crash on bridge %d", i));
                crashed = true;
                break;
            }
        }
        if (!crashed) {
            System.out.println("Will not crash");
        }
    }
}