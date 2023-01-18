package Recursion;

public class FactorialNo {
    public static void main(String[] args) {
        System.out.println(  calculatefactorial(5));
    }
    public static int calculatefactorial(int n){
        if(n == 1 ){
            return 1;
        }

      // int fact =  calculatefactorial(n - 1);
      // int factno = n * fact;
       return n*calculatefactorial(n-1);

    }
}
