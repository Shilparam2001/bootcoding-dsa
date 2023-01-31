package Search;

public class Solve {

        public static void age(int i){
            int length = 365;

            if (i > 0 && length==365){

                System.out.println("Age in days:" + ( length*i));
            }
            else{
                System.out.println("Invalid Age:");
            }
        }
        public static void main(String [] args){


           age(5);
        }
    }


