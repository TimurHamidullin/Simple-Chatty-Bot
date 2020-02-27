import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var int1 = scanner.nextInt();
        var int2 = scanner.nextInt();
        var int3 = scanner.nextInt();
        var int4 = scanner.nextInt();

        System.out.format("%d %d %d %d", --int1, --int2, --int3, --int4);
    }
}