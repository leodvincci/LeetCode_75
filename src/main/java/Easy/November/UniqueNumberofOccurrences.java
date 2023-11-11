package Easy.November;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueNumberofOccurrences {
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> myMap = new HashMap<>();
        HashSet<Integer> mySet = new HashSet<>();
        for(int i : arr){
            if(myMap.containsKey(i)){
                myMap.put(i,myMap.get(i)+1);
            }else{
                myMap.put(i,1);
            }
        }
        mySet.addAll(myMap.values());
        return mySet.size() == myMap.size();

    }

    public static void main(String[] args) {

        int[] arr = {1,2,2,1,1,3,12};
        System.out.println(uniqueOccurrences(arr));



    }
}
