/**
 * Created by jackli on 6/15/2015.
 */
public class One_5 {
    public static void main(String[] args) {
        System.out.println(compressString("abca"));
    }

    public static String compressString(String s){
        StringBuilder sb = new StringBuilder();
        char l = s.charAt(0);
        int c = 1;
        for (int i = 1; i <s.length(); i++) {
            if (s.charAt(i) == l){
                c++;
            }else{
                sb.append(l);
                sb.append(c);
                l = s.charAt(i);
                c = 1;
            }
        }
        sb.append(l);
        sb.append(c);
        if (sb.length() < s.length()){
            return sb.toString();
        }else{
            return s;
        }

    }
}
