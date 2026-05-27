package recursion;

import java.util.Arrays;

public class Fibonaccii {
    static int [] F ={-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
    public static int fib(int n){
        if(n<=1) return n;
        int t1=0,t2=1,t=0;
        for(int i=2;i<=n;i++){
            t=t1+t2;
            t1=t2;
            t2=t;
        }
        return t;
    }
    static int recursiveFib(int n){
        if(n<=1)return n;
        return recursiveFib(n-1)+recursiveFib(n-2);
    }
    static int memoizationFib(int n){
        if(n<=1){
            F[n]=n;
            return n;
        }
        else{
           if(F[n-1]==-1){
               F[n-1]=memoizationFib(n-1);
           }
           if(F[n-2]==-1) F[n-2]=memoizationFib(n-2);
           return  F[n-1]+F[n-2];
        }

    }
    public static void main(String []ar){
        System.out.println(fib(10));;
        System.out.println(recursiveFib(10));
        System.out.println(memoizationFib(10));
        Arrays.fill(F, -1);
    }
}
