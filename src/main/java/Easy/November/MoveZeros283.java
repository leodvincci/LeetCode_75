package Easy.November;

import java.util.Arrays;

public class MoveZeros283 {

    public static int[] swap(int[] arr,int i,int j){
        int oldNum = arr[i];
        arr[i] = arr[j];
        arr[j] = oldNum;
        return arr;
    }

    public static void moveZeroes(int[] nums) {
        int i = 0;
        int j = i + 1;

        while (j < nums.length){
            System.out.println(Arrays.toString(nums));
            System.out.println(i + " " + j);
            if(nums[i] == 0){
                if(nums[j] != 0){
                    swap(nums,i,j);
                    i++;
                    j = i+1;
                }else {
                    j++;
                }
            } else if (nums[i] != 0) {
                i++;
                j++;
            }
        }

        System.out.println(Arrays.toString(nums));

    }

    public static void main(String[] args) {
        int[] nums = {73348,66106,-85359,53996,18849,-6590,-53381,-86613,-41065,83457,0};
        moveZeroes(nums);
    }
}
