import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var startInt = scanner.nextInt();
        var endInt = scanner.nextInt();

        for (int i = startInt; i <= endInt; i++) {
            var isFizz = i % 3 == 0;
            var isBuzz = i % 5 == 0;
            if (!isFizz && !isBuzz) {
                System.out.println(i);
            } else if (isFizz && isBuzz) {
                System.out.println("FizzBuzz");
            } else if (isFizz) {
                System.out.println("Fizz");
            } else {
                System.out.println("Buzz");
            }
        }
    }
}