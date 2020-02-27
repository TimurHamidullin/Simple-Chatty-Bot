import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println(productOfNumbersInLarge(scanner.nextInt(), scanner.nextInt()));
    }

    public static long productOfNumbersInLarge(int min, int max) {
        long product = 1;
        for (int i = min; i < max; i++) {
            product *= i;
        }
        return product;
    }
}