package recursion;

public class TaylorSeries {
    static double p=1,f=1,res=0;
    public static double e(int x,int n){
        if(n==0) return 1;
        else{
            res=e(x,n-1);
            p*=x;
            f*=n;
            return res+p/f ;
        }

    }
    public static void main(String []ar){
        System.out.println(e(1,100));
    }
}
