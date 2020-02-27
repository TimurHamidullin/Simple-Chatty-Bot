import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var numberOfSquirrels = scanner.nextInt();
        var numberOfNuts = scanner.nextInt();

        System.out.println(numberOfNuts % numberOfSquirrels);
    }
}