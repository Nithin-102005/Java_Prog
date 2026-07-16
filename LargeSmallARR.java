import java.util.Scanner;
public class LargeSmallARR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the row : ");
        int rows = sc.nextInt();

        System.out.println("Enter the cols : ");
        int cols =sc.nextInt();

        int[][] a = new int[rows][cols];
        
        System.out.println("Enter the Elements :");

        for(int i =0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
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

        int L = Integer.MIN_VALUE;
        int S = Integer.MAX_VALUE;

        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<a[0].length;j++){
                if(a[i][j] > L ){
                    L = a[i][j];
                }
                if(a[i][j] < S){
                    S = a[i][j];
                }
            }
        }

        System.out.println("The Largest Number is : "+ L);
        System.out.println("The Smallest Number is :"+S);

        sc.close();

    }
}
