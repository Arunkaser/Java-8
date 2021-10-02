package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {

    public static void main(String[] args) {
        //// Integer Sorting
        List<Integer> list = Arrays.asList(3,32,42,56,12,65,68);

        //Ascending Order
        List<Integer> list2 = list.stream().sorted().collect(Collectors.toList());
        System.out.println(list2);

        //Descending Order
        List<Integer> list3 = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(list3);

        ////String Sorting

        //Ascending Order
        List<String> str_list = Arrays.asList("Kat","John","Aston","Dwayne");
        List<String> asc_sortedList = str_list.stream().sorted().collect(Collectors.toList());
        System.out.println(asc_sortedList);

        //Descending Order
        List<String> des_sortedList = str_list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(des_sortedList);
    }
}
