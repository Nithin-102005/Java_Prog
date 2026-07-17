import java.util.Arrays;
import java.util.Scanner;
public class String4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First String : ");
        String s1 = sc.nextLine();
        System.out.println("Enter the Second String :");
        String s2 = sc.nextLine();

        if(s1.length() != s2.length()){
            System.out.println("Not an anagram");
        }
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        
        if(Arrays.equals(a,b)){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not an Anagram");
        }
       sc.close();
    }
}
