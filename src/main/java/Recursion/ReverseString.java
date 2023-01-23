package Recursion;

public class ReverseString {
    public static void main(String[] args) {
        reverseString("Hello");
    }
    public static void reverseString(String s){
        if(s == " "){
            return;
        }
        System.out.println(s.charAt(s.length()-1));
        reverseString(s.substring(0,s.length()-1));
    }
}
