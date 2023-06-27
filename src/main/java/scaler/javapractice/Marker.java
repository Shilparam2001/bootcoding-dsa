package scaler.javapractice;

import java.util.ArrayList;
import java.util.Scanner;

public class Marker {
    public static void main(String[] args) {


        ArrayList<String> markers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marker colors (enter -1 to exit):");

        while (true) {
            String color = scanner.nextLine();
            if (color.equals("-1")) {
                break;
            }
            markers.add(color);
        }
    }
}


       /* System.out.println("Marker collection:");
        for (String color : markers) {
            System.out.println(color);

        }
    }
}

*/




