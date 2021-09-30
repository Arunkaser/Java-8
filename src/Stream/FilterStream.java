package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Filter;
import java.util.stream.Collectors;

public class FilterStream {

    public static void main(String[] args) {
        FilterStream.filterList();
    }

    public static void filterList() {
        List<String> list = Arrays.asList("Rahul", "Arun", "Prashant", "Atul");

        // filter element from stream and collect in collector
        List<String> str_list = list.stream().filter(name -> name.length() < 5).collect(Collectors.toList());
        System.out.println(str_list);

        // OR print the element
        list.stream().filter(name -> name.length() > 4).forEach(System.out::println);

    }
}
