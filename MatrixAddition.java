import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        // Initialize the Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get matrix dimensions from the user
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        // Instantiate the 2D arrays based on user dimensions
        int[][] matrixA = new int[rows][cols];
        int[][] matrixB = new int[rows][cols];
        int[][] sumMatrix = new int[rows][cols];

        // Step 2: Populate the first matrix
        System.out.println("\nEnter elements for Matrix A:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Element A[%d][%d]: ", i, j);
                matrixA[i][j] = scanner.nextInt();
            }
        }

        // Step 3: Populate the second matrix
        System.out.println("\nEnter elements for Matrix B:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Element B[%d][%d]: ", i, j);
                matrixB[i][j] = scanner.nextInt();
            }
        }

        // Step 4: Perform element-wise addition
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        // Step 5: Display the resultant sum matrix
        System.out.println("\nResultant Matrix (A + B):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sumMatrix[i][j] + "\t");
            }
            System.out.println(); // Move to the next row
        }

        // Close the scanner object to prevent memory leaks
        scanner.close();
    }
}
