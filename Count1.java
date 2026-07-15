public class Count1 {
    public static void main(String[] args) {
        int[] a = {-1,-2,3,4,5,-6};
        int b= 0;
        int c= 0;
        int[] d;
        int[] e; 
        int l = a.length;
        for(int i = 0;i<l; i++){
            if(a[i]<0){
                b++;
            }
           else if(a[i]>=0){
                c++;
            }
    }
    for(int i =0 ;i<l;i++)
    {
        if(a[i]<0){
            System.out.println(a[i]);
        }
        else{
            System.out.println(a[i]);
        }
    }
           System.out.println("The Number of positive : " + c);
           System.out.println("The Number of negative : "+b);    
    }

}
