import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var side1 = scanner.nextInt();
        var side2 = scanner.nextInt();
        var side3 = scanner.nextInt();

        System.out.println(triangleIsExist(side1, side2, side3));
    }

    public static String triangleIsExist(int side1, int side2, int side3) {
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            return "YES";
        } else {
            return "NO";
        }
    }
}