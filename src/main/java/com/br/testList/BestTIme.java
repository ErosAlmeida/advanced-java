package com.br.testList;

class Solution {
    public int maxProfit(int[] prices) {
        // verificar o menor valor pra comprar
        // depois verificar o maior valor para vender
        // fazer venda menos compra e retornar

        if (prices == null || prices.length == 0) {
            return 0;
        }

        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i]);
        }
        //verificar menor valor
        if (prices == null || prices.length == 0) {
            return 0;
        }
        if (prices.length > prices[0]) {
            return prices[0];
        }

//        if (prices.length == 1) {
//            return prices[0];
//        }

        return 0;
    }
}

public class BestTIme {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] prices = {7, 1, 5, 3, 6, 4};

        System.out.println(s.maxProfit(prices));
    }
}