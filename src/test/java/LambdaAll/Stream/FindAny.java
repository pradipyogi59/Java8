package LambdaAll.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAny {
    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(2,3,4,5);

        Optional<Integer> a =number.stream ().findAny ();
        System.out.println (a.get ());
    }
}
