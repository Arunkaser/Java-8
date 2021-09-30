package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctNumberFromList {
    public static void main(String[] args) {
        //Distinnct
        List<Integer> list = Arrays.asList(1,1,1,1,4,4,2,5,2,6,34,23,12,23,23);
        List<Integer> list2 = list.stream().distinct().collect(Collectors.toList());
        System.out.println(list2);

        //count
        System.out.println(list2.stream().count());
        //limit
        System.out.println(list2.stream().limit(6).collect(Collectors.toList()));
    }

}
