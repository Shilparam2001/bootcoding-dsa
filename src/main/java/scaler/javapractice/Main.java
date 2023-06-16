package scaler.javapractice;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void f2(){
        String[] fruits = {"Apple","Orange","Lemon", "Guava" };
        //Arrays.sort(fruits);
        Arrays.sort (fruits, Collections.reverseOrder());
        System.out.println("After sorting :" + Arrays.toString(fruits));
    }
    public static void f1(){
        int[] numbers = {4, 9, 1, 3, 2, 8, 7, 8, 6, 5};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void main(String[] args) {
        f2();
    }
}
