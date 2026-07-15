import java.util.Scanner;

public class CountOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter the element to count: ");
        int b = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == b) {
                count++;
            }
        }
        System.out.println("Occurrence of " + b + " = " + count);

        sc.close();
    }
}