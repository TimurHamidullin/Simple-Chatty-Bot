import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var numberOfCups = scanner.nextInt();
        var isWeekend = scanner.nextBoolean();

        if (isWeekend) {
            System.out.println(betweenExclusive(numberOfCups, 15, 25));
        } else {
            System.out.println(betweenExclusive(numberOfCups, 10, 20));
        }
    }

    public static boolean betweenExclusive(int x, int min, int max) {
        return x >= min && x <= max;
    }
}