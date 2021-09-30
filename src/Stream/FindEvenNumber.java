package Stream;

import java.util.Arrays;
import java.util.List;

public class FindEvenNumber {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,4,7,5,78,34,45,55);
        list.stream().filter(num->num%2==0).forEach(n->System.out.println(n));
    }
}
