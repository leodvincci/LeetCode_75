package Easy.November;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FindTheDifferenceTwoArrays {

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {


        HashMap<Integer,Integer> myMap_1 = new HashMap<>();
        HashMap<Integer,Integer> myMap_2 = new HashMap<>();
        List<List<Integer>> myLst = new ArrayList<>();
        List<Integer> resLst1 = new ArrayList<>();
        List<Integer> resLst2 = new ArrayList<>();

        for(int i = 0; i < nums1.length; i++){
            myMap_1.put(nums1[i],i);
        }

        for(int i = 0; i < nums2.length; i++){
            myMap_2.put(nums2[i],i);
        }

        for(int k: myMap_1.keySet()){
            if(!myMap_2.containsKey(k)){
                resLst1.add(k);
            }
        }

        for(int k: myMap_2.keySet()){
            if(!myMap_1.containsKey(k)){
                resLst2.add(k);
            }
        }


        myLst.add(resLst2);
        myLst.add(resLst1);
        return myLst;

    }

    public static void main(String[] args) {
       int[] nums1 = {-80,-15,-81,-28,-61,63,14,-45,-35,-10};
       int[] nums2 = {-1,-40,-44,41,10,-43,69,10,2};
        System.out.println(findDifference(nums1,nums2));




    }
}
