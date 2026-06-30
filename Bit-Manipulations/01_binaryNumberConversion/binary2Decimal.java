public class binary2Decimal {
    public static int binary2Decimal(String num){
        int res=0;
        int pow=1;
        for(int i=num.length()-1;i>=0;i--){
            // if(num.charAt(i)=='1') res+=Math.pow(2,(num.length()-1)-i); this is using Math.pow()
            if(num.charAt(i)=='1') res+=pow;
            pow*=2;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(binary2Decimal("1101"));
    }
}
