import java.util.Scanner;

public class NumberArray {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter size of array: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20.");
            }
        } while (size > 20);
        arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.printf("%-17s%s", "The array is: ", "");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + "\t");
        }

        int max = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i + 1;
            }
        }
        System.out.println("\nThe max element is " + max + ", at position " + index + ".");
    }
}
