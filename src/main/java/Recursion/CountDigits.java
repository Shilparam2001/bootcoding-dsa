package Recursion;

public class CountDigits {
    public static void main(String[] args) {
        System.out.println( countDigits(99));
    }
    public static int countDigits(int x){
       if(x <= 9){
           return 1;
       }
       return 1 + countDigits(x/10);
}
}

