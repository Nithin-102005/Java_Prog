import java.util.Scanner;
public class practice6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the Number to be reversed : ");
        int a = sc.nextInt();
        int rev = 0;
        do{
            int b = a%10;
            rev = (rev*10) + b;
            a = a/10;
        }while(a>0);
         System.out.println("The reversed number is : "+ rev);
         sc.close();
    }
}
