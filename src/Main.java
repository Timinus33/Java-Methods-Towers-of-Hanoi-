public class Main {
    public static void main(String[] args) {
        towerOfHanoi(3, 'a', 'c', 'b');
    }

    private static void towerOfHanoi(int n, char a, char b, char c) {
        if (n == 0) {
            return;
        }
        towerOfHanoi(n - 1, a, c, b);
        System.out.println("Moving disk #" + n + " from rod " + a + " to rod " + b);
        towerOfHanoi(n - 1, c, b, a);
    }
}
