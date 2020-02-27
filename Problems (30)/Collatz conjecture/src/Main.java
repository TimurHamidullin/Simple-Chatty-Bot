import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var n = scanner.nextInt();

        while (n != 1) {
            System.out.print(String.format("%d ", n));
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n * 3 + 1;
            }
        }
        System.out.print(n);
    }
}