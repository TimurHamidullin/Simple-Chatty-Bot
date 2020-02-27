import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var n = 1;
        var m = scanner.nextLong();

        while (m > 0) {
            m /= n++;
        }
        System.out.println(--n);
    }
}
