public class LeftRotate {
    static void leftRotate(int []a){
        int temp=a[0];
        for(int i=0;i<a.length-1;i++){
            a[i]=a[i+1];
        }
        a[a.length-1]=temp;
    }
    public static void main(String []ar){
        int []a={1,2,3,4,5,6,7,8,9};
        leftRotate(a);
        for(int x:a)System.out.print(x+" ");
    }
}
