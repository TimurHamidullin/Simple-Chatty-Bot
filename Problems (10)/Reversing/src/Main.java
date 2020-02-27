import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        var int1 = number / 100;
        var int2 = number / 10 % 10 * 10;
        var int3 = number % 10 * 100;

        System.out.println(int3 + int2 + int1);
    }
}