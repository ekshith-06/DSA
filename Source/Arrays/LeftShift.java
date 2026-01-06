public class LeftShift {
    static void leftShift(int a[]){
        for(int i=0;i<a.length-1;i++){
            a[i]=a[i+1];
        }
        a[a.length-1]=0;// The first element is lost in Leftshift of an array so the last place is empty..
    }
    public static void main(String []ar){
        int a[]={1,2,3,4,5,6,7,8,9};
        leftShift(a);
        for(int x:a)System.out.print(x+" ");
    }
}
