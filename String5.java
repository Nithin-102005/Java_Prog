import java.util.Scanner;
public class String5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s1 = sc.nextLine();
        for(int i=0;i<s1.length();i++){
             char vow = s1.charAt(i);
            if(vow == 'a' || vow == 'e' || vow == 'i' || vow == 'o' || vow == 'u' ){
                 System.out.println(s1.replace(s1, "*"));
            }
            else{
                System.out.println("No vowels to mask");
            }
        }
        System.out.println(s1);
        sc.close();
    }
}
