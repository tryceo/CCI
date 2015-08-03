import java.util.Arrays;

/**
 * Created by jackli on 6/15/2015.
 */
public class One_3 {

    public static void main(String[] args) {

        System.out.println(perm("asfd", "fsas"));
    }

    public static boolean perm(String a, String b){

        int[] lettersA= getLetterCounts(a);
        int[] lettersB = getLetterCounts(b);

        return Arrays.equals(lettersA, lettersB);
    }

    public static int[] getLetterCounts(String s){
        int[] letters = new int[26];
        for (int i = 0; i < s.length(); i++) {
            letters[s.charAt(i)-'a'] ++;
        }

        return letters;
    }

}
