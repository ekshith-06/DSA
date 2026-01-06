public class RightRotate {
    static void rightRotate(int []a){
        int temp=a[a.length-1];
        for(int i=a.length-1;i>0;i--){
            a[i]=a[i-1];
        }
        a[0]=temp; //The discarded rightmost element is rotated i.e placed at first..
    }
    public static void main(String []ar){
        int []a={1,2,3,4,5,6,7,8,9};
        rightRotate(a);
        for(int x:a)System.out.print(x+" ");
    }
}
