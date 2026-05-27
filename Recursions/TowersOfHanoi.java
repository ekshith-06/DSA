package recursion;

public class TowersOfHanoi {
    static void TOH(int n,char A, char B, char C){
        // n is number of discs
        // A,B,C are 3 towers
        if(n>0){
            TOH(n-1,A,C,B);
            System.out.println("From "+ A+" to "+C);
            TOH(n-1,B,A,C);
        }
    }

    public static void main(String []ar){

        TOH(10,'A','B','C');
    }
}
