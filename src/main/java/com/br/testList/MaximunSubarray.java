package com.br.testList;

class Solution {
    public int maxSubArray(int[] nums) {
        if ( nums == null || nums.length == 0) {
            return 0;
            }
        int valorPositivo = nums[0];
        int maiorSoma = nums[0];

        for (int i = 1; i < nums.length; i++) {
            valorPositivo = Math.max(valorPositivo + nums[i], nums[i]);

            maiorSoma = Math.max(maiorSoma, valorPositivo);
        }

        return maiorSoma;

    }
}

public class MaximunSubarray {
    public static void main(String[] args) {
        int[] nums = {5,4,-1,7,8};

        Solution s = new Solution();

        System.out.println(s.maxSubArray(nums));
    }
}
