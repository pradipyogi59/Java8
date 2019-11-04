package LambdaAll.PrimitiveTypeFuncationalInterface;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class basic {

    //Automatic conversion of prmitive to wrapper class(object) its called autoboxing Integer i=10;

    //Integer i =new Integer(10); wrapper object : now int x =i(x always accept primitive type) but we assing wrapper type(object type) ; Object to primitive automatically AutoUnboxing; compiler rensposible for autoboxing and autounboxing

    //Predicate<T> : one input parameter T Type
    //Funcation predicate always accept Obhect type parameter like aboive : Predicate<Integer>

    public static void main(String[] args) {


        int[] a = {10, 20, 30, 40, 50, 60, 70,31};
        Predicate<Integer> o = o1 -> o1 % 2 == 0;

        for (int x : a) {
            System.out.println (o.test ( x ) );
        }
        // WE normally do with Object type parameter.
        //Performance wise above is never recommended. Problem is Predicate want Integer type argument. but input value is int so when pass
        // like o.test(x)  internally x converted to Integer type (Object type). bcoz of autoboxing concept.


    }
}
