package scaler.javapractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {
        //Creating an object of ArrayList class
        //ArrayList created is empty and its size is 10 by default
        ArrayList arr = new ArrayList<>();
        arr.add(Integer.valueOf(1));  //Integer Object
        arr.add("Scaler"); // String object
        System.out.println(arr);

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1,5);
        System.out.println(list);

        List<Integer> list2 = new ArrayList<>();
        list2.add(25);
        list2.addAll(list);

        System.out.println(list2);

        list.remove(1);
        list.remove(Integer.valueOf(1));
        System.out.println(list);

        if(list.contains(3)){
            System.out.println("Yes");

        list2.set(0,50);
        for(int i = 0; i < list2.size(); i++ ){
            System.out.println(list2.get(i) + " ");
        }

        //for Each loop
            for (Integer x : list2){
                System.out.println(x + " ");
            }


        //using an Iterator
            Iterator<Integer> it = list.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }
        }
    }
}
