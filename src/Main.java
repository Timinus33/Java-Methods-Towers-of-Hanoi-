import java.util.Scanner;

public class Main {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static int iterations = 0;

    public static void main(String[] args) {
        System.out.print("Please enter the amount of disks: ");
        String userInput = SCANNER.next();
        while (!userInput.chars().allMatch(Character::isDigit)) {
            System.out.print("Invalid input! Please enter a valid number [0-9]: ");
            userInput = SCANNER.next();
        }

        towerOfHanoi(Integer.parseInt(userInput), 'a', 'c', 'b');
        System.out.println("The method requires " + iterations + " iterations to solve the puzzle.");
        SCANNER.close();
    }

    private static void towerOfHanoi(int n, char a, char b, char c) {
        if (n == 0) {
            return;
        }

        iterations++;
        towerOfHanoi(n - 1, a, c, b);
        towerOfHanoi(n - 1, c, b, a);
    }
}
