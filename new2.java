import java.util.Scanner;
public class new2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a ;
        do{
            System.out.println("Enter a number: ");
            a = scanner.nextInt();
        } while (a <=0);
        System.out.println("Valid number entered: " + a);
        scanner.close();
    }
}
