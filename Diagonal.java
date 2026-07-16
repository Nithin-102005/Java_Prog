import java.util.Scanner;

public class Diagonal {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of rows: ");
        int rows = sc.nextInt();

        System.out.println("Enter the Number of Columns: ");
        int cols = sc.nextInt();
        
        int[][] a = new int[rows][cols];

         System.out.println("Enter the Elements :");

        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<a[0].length;j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.print("The array : ");
        System.out.println(" ");

        for(int i = 0 ; i< a.length;i++){
            for(int j=0;j< a[0].length;j++){
            
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
       
        System.out.println("The Diagonal elements: ");
        for (int i = 0; i < a.length; i++) {
    System.out.print(a[i][i] + " ");
    }
    System.out.println(" ");

    int n = a.length;
    System.out.println("The secondary Diagonal elements : ");

for (int i = 0; i < n; i++) {
    System.out.print(a[i][n - 1 - i] + " ");
}


        sc.close();
    }
}
