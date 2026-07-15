import java.util.Scanner;
public class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0 ;
        System.out.println("Enter the number of elements :");
        int n = sc.nextInt();
        int [] a = new int[n];
        int min = a[0];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            if(a[i]%2==1){
                count +=1;
            }
        }
       System.out.println("The Number of odd elements : "+count);
       sc.close();
    }
}
