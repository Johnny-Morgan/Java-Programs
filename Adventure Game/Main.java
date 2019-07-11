import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Johnny on 11/07/2019
 */
public class Main {

    private static Map<Integer, Location> locations = new HashMap<>();
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        locations.put(0, new Location(0, "You are learning about maps in java"));
        locations.put(1, new Location(1, "You are standing at the end of a dirt track"));
        locations.put(2, new Location(2, "You are at the top of a mountain"));
        locations.put(3, new Location(3, "You are inside an ancient burial chamber"));
        locations.put(4, new Location(4, "You are in a valley beside a stream"));
        locations.put(5, new Location(5, "You are in the woods"));

        int loc = 1;
        while(true) {
            System.out.println(locations.get(loc).getDescription());
            if(loc == 0) {
                break;
            }
            loc = keyboard.nextInt();
            if(!locations.containsKey(loc)) {
                System.out.println("You cannot go in that direction");
            }
        }
    }
}