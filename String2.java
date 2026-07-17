import java.util.Scanner;
public class String2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the words : ");
        String word = sc.nextLine();
        int count = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        for(int i =0;i<word.length();i++){
            char vow = word.charAt(i);
          if(vow >= 'a' && vow<= 'z'){
            if(vow == 'a' || vow == 'e' || vow == 'i' || vow == 'o' || vow == 'u' ){
                count ++;
            }
            else
                count1++;
          } 
          if(vow >= 'A' && vow <= 'Z'){
            count4 ++;
          } 
            else if(vow >= '0' && vow <= '9') {
                count2++;
            } else if(vow != ' ') {
                count3++;
            }
        }
           System.out.println("The number of Vowels : " + count);
           System.out.println("The number of Consonants: "+count1);
           System.out.println("The number of Digits: "+count2);
           System.out.println("The number of Sequence: "+count3);
           System.out.println("The number of Capital Letters: "+count4);


        sc.close();
    }
}
