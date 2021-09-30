package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapStream {

    public static void main(String[] args) {
        //Flatmap is used to process complex map

        List<String> l1 = Arrays.asList("Harry","Simon");
        List<String> l2 = Arrays.asList("Sam","Gary");
        List<String> l3 = Arrays.asList("Veronica","Bossman");
        List<List<String>> masterList = Arrays.asList(l1,l2,l3);
        System.out.println(masterList);
        System.out.println("---------------------------");
        List<String> listStream = masterList.stream().flatMap(n -> n.stream().map(s->s.toUpperCase())).collect(Collectors.toList());
        System.out.println(listStream);
    }


}
