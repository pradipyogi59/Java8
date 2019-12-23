package LambdaAll.FuncationalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Practice2 {

    public static void main(String[] args) {

//        ArrayList<String> list1=new ArrayList<>();
//        list1.add (  "one");
//        list1.add (  "two");
//        list1.add (  "three");
//        list1.add (  "four");
//
//        ArrayList<String> list2=new ArrayList<>();
//        list2.add (  "five");
//        list2.add (  "six");
//        list2.add (  "seven");
//        list2.add (  "eight");
//
//        ArrayList<String> list3=new ArrayList<>();
//        list3.add (  "nine");
//        list3.add (  "ten");
//        list3.add (  "eleven");
//        list3.add (  "twelve");
//
//
//        ArrayList<ArrayList<String>> finalArrayList=new ArrayList<>();
//        finalArrayList.add(list1);
//        finalArrayList.add(list2);
//        finalArrayList.add(list3);
//
//
//        finalArrayList.stream ( ).peek ( i -> System.out.println ( i ) ).flatMap ( i->i.stream () ).peek ( i-> System.out.println (i ) ).collect ( Collectors.toList () );

        ArrayList<Integer> ar=new ArrayList<>();
        ar.add ( 10 );
        ar.add ( 2 );
        ar.add ( 30 );
        ar.add ( 4 );
        ar.add ( 4 );
        ar.add ( 50 );


       // ar.stream ().distinct ().forEach ( i-> System.out.println (i ) );

       // Optional<Integer> any = ar.stream ( ).findAny ( );
        //System.out.println (any. );

        System.out.println (
                ar.stream ().allMatch ( i->i%2==0 )
        );


    }

}
