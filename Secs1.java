public class Secs1 {
    public static void main(String[] args) {
        int[] a ={12,24,32};
        int l1 = Integer.MIN_VALUE;
        int l2 = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>l1){
                l2=l1;
                l1=a[i];
            }
            else if(a[i]>l2){
                l2 = a[i];
            }
        }
        System.out.println(l2);
    }
}
