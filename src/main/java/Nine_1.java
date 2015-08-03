/**
 * Created by jackli on 6/18/2015.
 */
public class Nine_1 {

    public static int numberOfWays(int n){
        if (n < 0){
            return 0;
        }
        if (n ==0 ){
            return 1;
        }

        int ways = numberOfWays(n-1) + numberOfWays(n-2) + numberOfWays(n-3);

        return ways;
    }
}
