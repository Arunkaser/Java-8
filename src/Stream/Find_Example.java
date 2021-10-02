package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Find_Example {
    public static void main(String[] args) {

        //Find Any
        List<String> str_list = Arrays.asList("John","katty","Aston","Dwayne");
        String result = str_list.stream().findAny().get();
        System.out.println(result);

        //Find First
        String result2 = str_list.stream().findFirst().get();
        System.out.println(result2);
    }
}
