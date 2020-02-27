import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var num = 0;

        while (scanner.hasNextInt()) {
            num = scanner.nextInt();
            if (num == 0) {
                break;
            } else {
                if (num % 2 == 0) {
                    System.out.println("even");
                } else {
                    System.out.println("odd");
                }
            }
        }
    }
}