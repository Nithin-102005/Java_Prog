import java.util.Scanner;
public class practice2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Celsius : ");
        float a = sc.nextFloat();
        float far = (a*9/5)+ 32f;
        System.out.println("The Fahrenheit is : "+far);
        sc.close();
    }
}