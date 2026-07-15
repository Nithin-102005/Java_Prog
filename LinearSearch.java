import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n = sc.nextInt();
        System.out.println("Enter the elements :");
        int d = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0;i<a.length;i++){
            if(a[i]==d){
                System.out.println("The Element found at : " + d);
            }
        }
      sc.close();      
    }
    
}
