package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapStream {
    public static void main(String[] args) {

        //AddNumberToEachElement()

        List<Integer> map = Arrays.asList(1,2,3,4,5);
        List<Integer> map1 = map.stream().map(n -> n + 11).collect(Collectors.toList());
        System.out.println(map1);


    }
}
