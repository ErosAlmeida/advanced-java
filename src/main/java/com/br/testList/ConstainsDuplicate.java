package com.br.testList;

import java.util.Arrays;

public class ConstainsDuplicate {
    public static void main(String[] args) {
        int[] nums = new int[4];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        System.out.println(Arrays.toString(nums));
        boolean duplicate = false;

       for (int i = 0; i < nums.length; i++) {
           for (int j = i + 1; j < nums.length; j++) {
               if (nums[i] == nums[j]) {
                   duplicate = true;
               }
           }

       }
       if (duplicate) {
           System.out.println("True");
       }else {
           System.out.println("False");
       }
    }
}
