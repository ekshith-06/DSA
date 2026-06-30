public class Solution {
    public static String  convert2Binary(int n){
        if(n==0) return "0";
        StringBuilder res=new StringBuilder();
        while(n!=0){
            res.append(n%2);
            n/=2;
        }
        return res.reverse().toString();
    }
    public static void main(String[] args) {
        // to convert decimal to binary
        System.out.println(convert2Binary(25));
    }
}
