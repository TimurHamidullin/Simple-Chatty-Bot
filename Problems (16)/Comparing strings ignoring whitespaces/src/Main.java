import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var line1 = scanner.nextLine().replace(" ", "");
        var line2 = scanner.nextLine().replace(" ", "");

        System.out.println(line1.equals(line2));
    }
}