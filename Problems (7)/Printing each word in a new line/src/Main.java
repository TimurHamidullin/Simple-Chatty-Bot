import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        var stringList = new ArrayList<String>();
        var numberOfStrings = 5;

        for (int i = 0; i < numberOfStrings; i++) {
            stringList.add(scan.next());
            System.out.println(stringList.get(i));
        }
    }
}