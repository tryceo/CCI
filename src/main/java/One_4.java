/**
 * Created by jackli on 6/15/2015.
 */
public class One_4 {

    public static void main(String[] args) {
        char[] chars = new char[100];
        chars[0]  = 'a';
        chars[1] = 'b';
        chars[2] = 'a';
        chars[3] = ' ';
        chars[4] = 'a';
        replaceSpaces(chars, 5);
        System.out.println(chars);

    }
    public static void replaceSpaces(char[] chars, int length){

        int count = 0;
        for (int i = 0; i < length; i++) {
            if (chars[i] == ' '){
                count++;
            }
        }

        int reall = length+(count*2);

        int j = 0;
        for (int i = 0; i < length ; i++) {
            if (chars[length-i-1] == ' '){
                chars[reall-j-1]='0';
                chars[reall-j-2]='2';
                chars[reall-j-3]='%';
                j+=3;
            }else{
                chars[reall-j-1] = chars[length-i-1];
                j++;
            }
        }
    }
}
