package Recursion;

public class SumOfNumbers {
    public static void main(String[] args) {
        System.out.println( sumOfNumbers(10));
    }
    public static int sumOfNumbers(int n){
        if(n != 0) {
            return n +( sumOfNumbers(n - 1));
        }

        else return n;

    }
}
