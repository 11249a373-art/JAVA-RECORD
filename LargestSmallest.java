import java.util.Scanner;

public class LargestSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("No elements to process.");
            sc.close();
            return;
        }

        int[] a = new int[n];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int largest = a[0];
        int smallest = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > largest) {
                largest = a[i];
            }
            if (a[i] < smallest) {
                smallest = a[i];
            }
        }

        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);
        sc.close();
    }
}
