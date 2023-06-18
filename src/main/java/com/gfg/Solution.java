package com.gfg;

public class Solution{
        public static int maxProfit(int[] prices) {
            int lsf = Integer.MAX_VALUE; //least so far
            int op = 0;    //overall profit
            int pist = 0; //profit if sold today

            for(int i = 0; i < prices.length; i++){
                if(prices[i] < lsf){
                    lsf = prices[i];
                }
                pist = prices[i] - lsf;
                if(op < pist){
                    op = pist;
                }
            }
            return op;
        }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[] {7,3,4,5,1}));
    }
    }




