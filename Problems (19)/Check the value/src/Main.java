import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(betweenExclusive(scanner.nextInt(), 0, 10));
    }

    public static boolean betweenExclusive(int x, int min, int max) {
        return x > min && x < max;
    }
}