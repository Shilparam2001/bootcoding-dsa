package scaler.javapractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortUsingSumDigits {

    //sort numbers according to sum of their digits
    public static int getSum(Integer x) {
        int sum = 0;
        while (x > 0) {
            sum = sum + x % 10;
            x = x / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(10);  //  1+0= 1
        A.add(22);  //  2+2= 4
        A.add(14);  //  1+4= 5
        A.add(40);  //  4+0= 4
        A.add(35);  //  3+5= 8
        A.add(51);  //  5+1= 6

        Collections.sort(A, new Comparator<Integer>() {

            public int compare(Integer o1, Integer o2) {
                return getSum(o1) - getSum(o2);
            }
        });

        System.out.println(A);


        //Lambda Function
        Collections.sort(A, (a, b) -> (getSum(a) - getSum(b)));
        System.out.println(A);

    }
}


