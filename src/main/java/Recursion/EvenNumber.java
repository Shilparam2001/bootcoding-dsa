package Recursion;

public class EvenNumber {
    public static void main(String[] args) {
    evenNumber(100);
    }
    public static void evenNumber(int x){
        if(x  == 1){
            return;

        }

        evenNumber(x - 1);
          if(x % 2 == 0){
              System.out.println(x);
          }



    }
}
