import java.util.Scanner;
public class SearchArray {
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
        System.out.println("Enter the key element to find : ");
        int key = sc.nextInt();
        for(int i = 0 ;i<a.length;i++){
            for(int j = 0;j<a[i].length;j++){
                if(a[i][j] == key){
                    System.out.println("Found at : "+ i + " "+ j);
                }
            }
        }
        sc.close();
    }
}
