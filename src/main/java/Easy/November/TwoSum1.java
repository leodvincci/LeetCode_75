package Easy.November;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum1 {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> myMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int searchFor = Math.abs(target)-Math.abs(nums[i]);
            if(myMap.containsKey(searchFor)){
                return new int[] {myMap.get(searchFor),i};
            }else {
                myMap.put(nums[i],i);
            }
        }
        return nums;
    }

    public static void main(String[] args) {

        int[] nums = {3,3};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));


    }

}
