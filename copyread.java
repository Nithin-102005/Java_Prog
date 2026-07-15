import java.util.Scanner;
public class copyread {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The size of the array:");
        int n = sc.nextInt();

        System.out.println("Enter the Elements :");
        int[] a = new int[n];
        int[] b = new int[n];

        for(int i=0;i<a.length;i++){
              a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
              b[i]=a[i];
        }
        System.out.println("-------------");
         for(int i=0;i<a.length;i++){
             System.out.println(b[i]);
        }
        sc.close();
    }
    
}
