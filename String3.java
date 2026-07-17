import java.util.Scanner;
public class String3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First String : ");
        String s1 = sc.nextLine();
        System.out.println("Enter the Second String :");
        String s2 = sc.nextLine();
         if (s1.compareTo(s2) == 0) {
            System.out.println("The strings are equal");
        } else {
            System.out.println("The strings are not equal");
        }
        
sc.close();
    }
}
