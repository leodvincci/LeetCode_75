package Easy.November;

import java.util.HashMap;

public class RansomeNote383 {

    public static boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character,Integer> noteMap = new HashMap<>();
        HashMap<Character,Integer> magMap = new HashMap<>();

        for (Character c : ransomNote.toCharArray()){
            if(noteMap.containsKey(c)){
                noteMap.put(c,noteMap.get(c)+1);
            }else {
                noteMap.put(c,1);
            }
        }

        for (Character c : magazine.toCharArray()){
            if(magMap.containsKey(c)){
                magMap.put(c,magMap.get(c)+1);
            }else {
                magMap.put(c,1);
            }
        }

        for(Character c: noteMap.keySet()){

            if(magMap.get(c) == null || noteMap.get(c) > magMap.get(c)){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String ransomNote = "a";
        String magazine = "b";

        boolean res = canConstruct(ransomNote,magazine);
        System.out.println(res);



    }
}
