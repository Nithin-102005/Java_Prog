public class rec3 {
    static void number(int start, int len){
        if(start>len){
            return ;
        }
        System.out.println("Current " + start);
        number(start+1, 10);
        System.out.println("Backtrack " + start);
    }
    public static void main(String[] args) {
        number(1,10);
    }
}
