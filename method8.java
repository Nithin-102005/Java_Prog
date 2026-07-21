public class method8 {
    public static int Fib(int n){
        if(n==0){
            return n;
        }
        if(n==1){
            return n;
        }
        return Fib(n - 1) + Fib(n - 2);
    }
    public static void main(String[] args) {
        int b = 50;
         for (int i=0;i<b;i++) {
            System.out.print(Fib(i) + " ");
        }
    }
}
