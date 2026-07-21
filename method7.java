public class method7 {
    public static long fact(int num){
        if(num <=1){
           return 1;
        }
        return num * fact(num-1); 
    }
    public static void main(String[] args) {
        int number = 10;
        long ans = fact(number);
       System.out.println("The Factorial is " +ans);
    }
   
}
