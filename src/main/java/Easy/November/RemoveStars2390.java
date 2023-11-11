package Easy.November;

import java.util.Arrays;
import java.util.Stack;

public class RemoveStars2390 {

    public static String removeStars(String s) {

        Stack<Character> res = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '*'){
                res.pop();
            }else {
                res.push(c);
            }
        }

        StringBuilder theResString = new StringBuilder();
        for (char c: res) {
            theResString.append(c);
        }

        return theResString.toString();

    }

    public static void main(String[] args) {
        String s = "erase*****";
        System.out.println(removeStars(s));

    }
}
