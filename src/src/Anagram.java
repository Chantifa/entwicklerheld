import java.util.Arrays;

public class Anagram {

    public static boolean isAnagram(String firstWord, String secondWord) {
        if(firstWord.length() != secondWord.length()){
            return false;
        }
        else {
            char[] first = firstWord.toCharArray();
            char[] second = secondWord.toCharArray();
            Arrays.sort(first);
            Arrays.sort(second);
            return Arrays.equals(first, second);
        }
    }

    public static void main(String [] args){
        System.out.println(isAnagram("eat", "tea"));
        System.out.println(isAnagram("are", "ears"));
    }

}
