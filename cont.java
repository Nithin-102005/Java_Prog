import java.util.Scanner;
public class cont {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] b =new int[n];
        for(int i=0;i<n;i++){
            b[i] = sc.nextInt();
        }

        for(int i =0;i<n;i++){
            System.out.println("The element of "+i+ " " +b[i]);
        }System.out.println(" ");
       for(int i =0;i<b.length;i++){
        System.out.println("The element 2 of "+i+ " "+b[i]);
       }
       sc.close();
    }
}
