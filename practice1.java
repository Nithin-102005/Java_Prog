import java.util.Scanner;
public class practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First  num : ");
        int a = sc.nextInt();
        System.out.println("Enter Second num : ");
        int b = sc.nextInt();
        System.out.println("Enter Third Sum : ");
        int c = sc.nextInt();
        int d = a + b + c ;
        System.out.println("The Sum of these Three numbers : "+d);
        sc.close();
    }
}
