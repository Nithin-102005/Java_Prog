import java.util.Scanner;

public class OddEvenArray {
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

        int even = 0;
        int odd = 0 ;

        for(int i = 0;i<a.length;i++){
            for(int j =0;j<a[0].length;j++){
                if(a[i][j]%2 ==0){
                    even ++;
                }
                else{
                    odd ++;
                }
            }
        }
        System.out.println("The number of even numbers : " + even);
        System.out.println("The number of odd  numbers : " + odd);

        sc.close();
    }
}
