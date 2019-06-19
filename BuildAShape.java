/**
 * Created by Johnny on 19/06/2019
 * Given an integer, return a string that will print a shape as long and as deep as the integer
 */
public class BuildAShape {

    public static final StringBuilder generateShape(int n) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                sb.append("+");
            }
            sb.append("\n");
        }
        return sb;
    }
    public static void main(String[] args) {
        // test generateShape method
        System.out.println(generateShape(1));
        System.out.println();
        System.out.println(generateShape(5));
        System.out.println();
        System.out.println(generateShape(10));
        System.out.println();
        System.out.println(generateShape(15));
    }
}
