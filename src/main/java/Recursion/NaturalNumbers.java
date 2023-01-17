package Recursion;

public class NaturalNumbers {
    public static void main(String[] args) {
        naturalNos(50);
    }
    public static void naturalNos(int num){
        if(num == 0) {
            return;
        }
        naturalNos(num - 1);{
            System.out.println(num);
        }

    }

}
