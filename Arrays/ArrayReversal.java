class ArrayReversal{
    static  void reverseArray(int[] a){
        //Two pointer like approach..
        for(int i=0,j=a.length-1;i<j;i++,j--){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }


    }
    public static void main(String []ar){
        int[] a ={1,2,3,4,5,6,7,8,9};
        reverseArray(a);
        for (int j : a) System.out.print(j + " ");
    }
}