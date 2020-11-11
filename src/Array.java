import java.util.Scanner;

public class Array {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int argc = scanner.nextInt();
        int[] argv = readIntegers(argc);
        System.out.println(findMin(argv));
    }

    public static int[] readIntegers(int argc) {
        int[] output = new int[argc];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < argc; i++) {
            if (scanner.hasNextInt()) {
                output[i] = scanner.nextInt();
            }
        }
        scanner.close();
        return output;
    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
