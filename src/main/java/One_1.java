/**
 * Created by jackli on 6/15/2015.
 */
public class One_1 {
    public static void main(String[] args) {
        System.out.println(unique("z"));
    }

    public static boolean unique(String s){
        int[] letters = new int[26];
        for (int i = 0; i < s.length(); i++) {
            letters[s.charAt(i)-'a'] +=1;
            if (letters[s.charAt(i)-'a']>1){
                return false;
            }
        }
        return true;
    }
}
