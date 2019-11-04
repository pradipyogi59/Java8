package LambdaAll.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Basic01 {

    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(2,3,4,5);

        number.stream ().filter ( p->p==2 ).forEach ( (p)-> System.out.println (p ) );
        List<Integer> newlist=number.stream ().filter ( p->p==3 ).collect ( Collectors.toList () );
        System.out.println (newlist.size () );


        number.stream ().map ( (a)->{
            if (a.equals ( 2 ))
            return   a= 200;
           else
               return a;
        } ).forEach ( (s)-> System.out.println (s ) );


        Stream<String> stream = Stream.of("feeks", "fOr",
                "fEEKSQUIZ", "feeksforGeeks");

       // boolean ans=stream.anyMatch ( p->Character.isUpperCase ( p.charAt ( 0 ) ) );
      //  System.out.println (ans );

        boolean ans2=stream.noneMatch ( p->Character.isUpperCase ( p.charAt ( 0 ) ) );
        System.out.println (ans2 );


    }
}
