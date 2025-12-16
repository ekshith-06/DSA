package recursion;

public class PowerOptimized {
    public static int pow(int m, int n){
        if(n==0) return  1;
        else if(n%2==0) return pow(m*m,n/2);
        else return pow(m*m,n/2)*m;
    }
    public static void main(String []ar){
        System.out.println(pow(2,5));
    }
}
