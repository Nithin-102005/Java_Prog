import java.util.Scanner;
public class practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>b){
          System.out.println("The num " + a + " is Greater than "+b);
        }
        else{
           System.out.println("The num " + b + " is Greater than "+a);
        }
      sc.close();                     
    }
}
