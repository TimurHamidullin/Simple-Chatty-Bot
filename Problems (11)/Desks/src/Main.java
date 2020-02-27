import java.util.Scanner;

class Main {
    public static int determineTheNumberOfDesksForGroup(int groupSize) {
        if (groupSize % 2 == 0) {
            return groupSize / 2;
        }
        else {
            return groupSize / 2 + 1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var numberOfGroups = 3;
        var numberOfDesks = 0;

        for (int i = 0; i < numberOfGroups; i++) {
            numberOfDesks += determineTheNumberOfDesksForGroup(scanner.nextInt());
        }

        System.out.println(numberOfDesks);
    }

}