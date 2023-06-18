package com.gfg;


public class GFG {
        static void printPat(int n)
        {
            int i, j, k;

            for (k = 0; k < n; k++) {
                for (i = n; i > 0; i--) {
                    for (j = 0; j < n - k; j++) {
                        System.out.print(i + " ");
                    }
                }
                System.out.print("$");
            }
        }

        public static void main(String[] args)
        {
            int N = 2;

            // Function call
            printPat(2);


        }
    }



