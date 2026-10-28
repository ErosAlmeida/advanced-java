package com.br.testList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ConstainsDuplicate {
    public static void main(String[] args) {
        int[] nums = new int[4];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        System.out.println(Arrays.toString(nums));
        boolean duplicate = false;

        Set<Integer> num = new HashSet<>();
        for (int num1 : nums){
            if(num.contains(num1)){
                duplicate = true;
                break;
            }
            num.add(num1);

        }
       if (duplicate) {
           System.out.println("True");
       }else {
           System.out.println("False");
       }
    }
}
