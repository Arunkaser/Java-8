package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatmapDemo2 {
    int id;
    String name;
    String Section;

    public FlatmapDemo2(int id, String name, String Section){
        this.id=id;
        this.name=name;
        this.Section=Section;
    }
    public static void main(String[] args) {

        List<FlatmapDemo2> student1 = new ArrayList<>();

        student1.add(new FlatmapDemo2(1,"Dev","A"));
        student1.add(new FlatmapDemo2(2,"Aish","B"));
        student1.add(new FlatmapDemo2(4,"Bob","C"));

        List<FlatmapDemo2> student2 = new ArrayList<>();

        student2.add(new FlatmapDemo2(10,"Samual","F"));
        student2.add(new FlatmapDemo2(15,"Chris","D"));
        student2.add(new FlatmapDemo2(18,"Alexa","E"));

        List<List<FlatmapDemo2>> mastersheet = Arrays.asList(student1, student2);
        List<String> StreamList = mastersheet.stream().flatMap(Collection::stream).map(name -> name.name).collect(Collectors.toList());
        System.out.println(StreamList);
    }
}
