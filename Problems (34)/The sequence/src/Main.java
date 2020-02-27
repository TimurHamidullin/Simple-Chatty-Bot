import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var n = scanner.nextInt();
        var count = 0;

        for (int i = 1; i <= n; i++) {
            if (count < n) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(String.format("%d ", i));
                    count++;
                    if (count == n) {
                        break;
                    }
                }
            }
        }
    }
}