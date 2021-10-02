package Stream;

import java.util.Arrays;
import java.util.List;

public class parallelStream {

    public static void main(String[] args) {
        List<student> list = Arrays.asList(
                new student("Shubham", 70),
                new student("Ankit", 89),
                new student("Danish", 65),
                new student("Rohan", 86),
                new student("Pritesh", 92),
                new student("Akash", 80),
                new student("Sharad", 83)
        );

        //Sequential Stream
        System.out.println("--------------------Sequential Stream--------------------------");

        list.stream().filter(s -> s.score >= 80)
                .limit(3)
                .forEach(st -> System.out.println(st.getName() + "-" + st.getScore()));

        System.out.println("----------------------------------------------------------");
        System.out.println("--------------------parallel Stream--------------------------");

        //Parallel Stream

        list.parallelStream().filter(s -> s.score >= 80)
                .limit(3)
                .forEach(st -> System.out.println(st.getName() + "-" + st.getScore()));

        System.out.println("----------------------------------------------------------");
        System.out.println("--------------------Convert  Stream() --> parallel Stream--------------------------");

        list.stream().parallel().filter(s -> s.score >= 80)
                .limit(3)
                .forEach(st -> System.out.println(st.getName() + "-" + st.getScore()));


    }
}

class student {
    String name;
    int score;

    public student(String name, int score) {
        this.name = name;
        this.score = score;

    }

    public String getName() {
        return this.name;
    }

    public int getScore() {
        return this.score;
    }

}
