import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var maxNumDiv4 = -1;

        while (scanner.hasNext()) {
            var currentNumber = scanner.nextInt();
            if (currentNumber % 4 == 0 && currentNumber > maxNumDiv4) {
                maxNumDiv4 = currentNumber;
            }
        }

        System.out.println(maxNumDiv4);
    }
}