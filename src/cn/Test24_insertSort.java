package cn;

import java.util.Arrays;

public class Test24_insertSort {
    public static void main(String[] args) {

        //double f = 3.4;

        int[] nums = {5,9,63,78,96,51,26,74,99,13,25,37};

        insertSort(nums);

        System.out.println(Arrays.toString(nums));
    }

    public static void insertSort(int[] nums){
        for(int i=0;i<nums.length;i++){
            for(int j=i;j>0;j--){
                if(nums[j-1]>nums[j]){
                    int temp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}




















