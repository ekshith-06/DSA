package recursion;

public class Ncr {
    static  int fact(int n){
        if(n==0) return 1;
        return fact(n-1)*n;
    }
    static int ncr(int n,int r){
        int num=fact(n);
        int den=fact(r)*fact(n-r);
        return num/den;
    }

    // Using recursion i.e without fact function // Its Generally Known As Pascals Triangle

    static int NCR(int n,int r){
        //Pascals Triangle...
        if(r==0 || n==r) return 1;
        return NCR(n-1,r-1)+NCR(n-1,r);
    }
    public static void main(String []ara){
        System.out.println(NCR(5,3));
    }
}
