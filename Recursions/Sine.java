package recursion;

public class Sine {
    static double p=1,f=1;
    static  double res=0;
    public static double sine(int x,int n){
        if(n==0){
            p=x;
            f=1;
            return  x;
        }
        else{
            res=sine(x,n-1);
            p=p*x*x;
            f=f*(2*n)*(2*n+1);
            if(n%2==0) return res + (p/f);
            else return  res-(p/f);
        }
    }
    public static void main(String []ar){
        System.out.println(sine(5,10));
        System.out.println(sine(5,10));
    }
}
