
package com.br.testList;

//class Solution {
//    public int maxProfit(int[] prices) {
//
//        if (prices == null || prices.length == 0) {
//            return 0;
//        }
//
//        int menorPreco = prices[0];
//        int cont = 0;
//
//        for (int i = 1; i < prices.length; i++) {
//
//            int lucro = prices[i] - menorPreco;
//
//            if (lucro > cont) {
//                cont = lucro;
//            }
//
//            if (menorPreco > prices[i]) {
//                menorPreco = prices[i];
//            }
//        }
//
//        return cont;
//    }
//}
//
//public class BestTIme {
//    public static void main(String[] args) {
//        Solution s = new Solution();
//
//        int[] prices = {7, 1, 5, 3, 6, 4};
//
//        System.out.println(s.maxProfit(prices));
//    }
//}
