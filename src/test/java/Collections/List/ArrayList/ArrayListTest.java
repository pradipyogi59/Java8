package Collections.List.ArrayList;

import java.util.*;

public class ArrayListTest {

    public static void main(String[] args) {


        List<Integer> list1=new ArrayList<> ();

        list1.add ( 0,1);
        list1.add ( 0,10 );
        list1.add ( 20 );
        list1.add ( 30 );

        System.out.println (list1 );

        Iterator<Integer> it=list1.listIterator ( 2 );
        //start from index 2 this option not available in iteratore
        while (it.hasNext ())
        {
            System.out.println (it.next () );
        }

        Set<Integer> set1=new HashSet<>();
       // set1.add ( 0,10 ); not bcoz its not preserve order

    }
}
