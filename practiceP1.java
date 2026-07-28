import java.util.*;

import java.util.Arrays;
public class practiceP1 {
     static int count = 0 ;
     static int Fib(int n){
        count++;
        if(n<=1){
            return n;
        }
        return Fib(n-1)+Fib(n-2);
     }
     public static void main(String[] args) {
        System.out.println(Fib(6));
        System.out.println(count);
     }
}
