import java.util.Scanner;
public class method5 {
    static  int oddEven(int num){
          if(num%2==0){
            System.out.println(num);
            System.out.println("This is Even");
          }
          else{
            System.out.println("This is odd");
          }
          return num;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        oddEven(a);
        sc.close();
    }
}
