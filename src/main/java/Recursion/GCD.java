package Recursion;

public class GCD {
    public static void main(String[] args) {
        System.out.println(GCD(14, 80));
    }
    public static int GCD(int x, int y){
        if(x == 0){
            return y;
        }
        return GCD(y%x, x);
    }
}
