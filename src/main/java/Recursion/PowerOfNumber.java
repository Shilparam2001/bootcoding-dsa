package Recursion;

public class PowerOfNumber {

    public static void main(String[] args) {
        System.out.println( powerIs(2, 3));
    }

    public static int powerIs(int x, int y) {
        if (y == 0) {
            return 1;
        }
      return x * powerIs(x , --y);
    }
}



