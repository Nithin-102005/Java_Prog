import java.util.Scanner;

public class SumArray {
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
       int sum = 0;
       
for(int i = 0; i < a.length; i++) {
        sum += a[i][i];
}

System.out.println("The sum of the Diagonal Matrix is : "+ sum);


int reverse = 0;
int n = a.length;


     for(int i = 0;i< a.length;i++){
       reverse += a[i][n - 1 - i] ; 
       
    }
 System.out.println("The sum of Second Diagonal Matrix is : "+ reverse);

        sc.close();
    }
}
