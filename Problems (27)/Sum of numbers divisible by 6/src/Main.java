import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var numberOfElements = scanner.nextInt();
        var sum = 0;

        for (int i = 0; i < numberOfElements; i++) {
            var n = scanner.nextInt();
            sum += (n % 6 == 0) ? n : 0;
        }
        System.out.println(sum);
    }
}