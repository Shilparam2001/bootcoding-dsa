package Recursion;

public class FibonacciSeries {
    public static void main(String[] args) {
        print(0, 1, 7);
    }
    public static void print(int a, int b, int n){
        if(n == 0){
            return;
        }
        int c = a + b;
        System.out.println(c);
        print(b, c, n-1);

    }
}
