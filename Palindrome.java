import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String word = sc.nextLine();
        String rev = "";

        for(int i=word.length()-1;i>=0;i--){
            rev += word.charAt(i);
        }
        if(word.equals(rev))
            System.out.println("It is a Palindrome");
        else
            System.out.println("It's Not a Palindrome");

        sc.close();
    }
}
