package Stream;

import java.util.HashSet;
import java.util.Set;

public class MatchExample {

    public static void main(String[] args) {

        //AnyMatch
        Set<String> fruits = new HashSet<>();
        fruits.add("One Apple");
        fruits.add("One Mango");
        fruits.add("More grapes");
        fruits.add("Two Guavas");
        fruits.add("Two Apple");

        //AnyMatch
        boolean result = fruits.stream().anyMatch(value -> value.startsWith("One"));
        System.out.println(result);

        //All Match
        boolean result1 = fruits.stream().allMatch(value -> value.startsWith("One"));
        System.out.println(result1);

        //All Match
        boolean result3 = fruits.stream().noneMatch(value -> value.startsWith("One"));
        System.out.println(result3);




    }

    //All Match

    // None Match
}
