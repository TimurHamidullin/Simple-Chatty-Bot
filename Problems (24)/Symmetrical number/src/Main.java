import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var number = scanner.nextInt();

        var digit1 = number / 1000;
        var digit2 = number / 100 % 10;
        var digit3 = number / 10 % 10;
        var digit4 = number % 10;

        if (digit1 == digit4 && digit2 == digit3) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}