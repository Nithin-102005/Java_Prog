import java.util.Scanner;

public class Boundary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter no of columns: ");
        int cols = sc.nextInt();

        int[][] a = new int[rows][cols];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Boundary Traversal:");

        for (int j = 0; j < cols; j++) {
            System.out.print(a[0][j] + " ");
        }
        for (int i = 1; i < rows; i++) {
            System.out.print(a[i][cols - 1] + " ");
        }

        if (rows > 1) {
            for (int j = cols - 2; j >= 0; j--) {
                System.out.print(a[rows - 1][j] + " ");
            }
        }
        if (cols > 1) {
            for (int i = rows - 2; i >= 1; i--) {
                System.out.print(a[i][0] + " ");
            }
        }

        sc.close();
    }
}

