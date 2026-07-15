import java.util.Scanner;
public class largeSmall{
       public static void main(String[] args)
       {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the size of the array:");
         int n =sc.nextInt();

         int[] a = new int[n];

         System.out.println("Enter the elements :");

         for(int i = 0;i <n;i++){
            a[i] = sc.nextInt();
         }

         int L = a[0];
         int S = a[0];

         for(int i =0;i<a.length;i++){
             if(a[i] > L){
                L = a[i];
             }

             if(a[i]<S){
                S = a[i];
             }
         }

         System.out.println("The Largest Number is : "+ L);
         System.out.println("The Smallest Number is :"+S);

         sc.close();
       }
}