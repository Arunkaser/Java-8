package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcateStream {

    public static void main(String[] args) {
        List<String> str_list1 = Arrays.asList("John","katty","Aston","Dwayne");
        List<String> str_list2 = Arrays.asList("Australia","US","UK","Russia");

        Stream<String> nameStream = str_list1.stream();
        Stream<String> countryStream = str_list2.stream();
        List<String> collect = Stream.concat(nameStream, countryStream).collect(Collectors.toList());
        System.out.println(collect);
    }

}
