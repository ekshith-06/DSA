public class RightShift {
    static void rightShift(int []a){
        for(int i=a.length-1;i>0;i--){
            a[i]=a[i-1];
        }
        a[0]=0; //Upon rightshifting array the right most element is gone.. so replacing empty first pos with 0..
    }
    public static void main(String []ar){
        int []a={1,2,3,4,5,6,7,8,9};
        rightShift(a);
        for(int x:a)System.out.print(x+" ");

    }
}
