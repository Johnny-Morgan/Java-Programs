import java.util.HashSet;

/**
 * Created by Johnny on 14/06/2019
 * The depth of an integer n is defined to be how many multiples of n it is necessary
 * to compute before all 10 digits have appeared at least once in some multiple.
 */
public class IntegerDepth {

    public static int computeDepth(int n) {
        int i, copy;
        HashSet<Integer> set = new HashSet<>();

        loop: for(i = 1;;i++) {
            copy = n;
            copy *= i;

            while (copy > 0) {
                set.add(copy % 10);
                copy /= 10;
                if(set.size() == 10)
                    break loop;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        // test computeDepth method
        System.out.println(computeDepth(42));
    }
}


