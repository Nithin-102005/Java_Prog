public class method6 {
    public static void odd(int num){
        if(num >= 20){
            return;
        }
        else{
            System.out.println(num);
        }
        odd(num+2);
    }
    public static void main(String[] args) {
        odd(1);
    }
}
