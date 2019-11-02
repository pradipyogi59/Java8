package LambdaAll.FuncationalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierInterface_Details {
    public static void main(String[] args) {

        //input type : N/A
        //Return type : t
        //method : get

        List<String> names=new ArrayList<>();
        names.add("java");
        names.add("python");


        Supplier<Double> random=()->Math.random ();
        System.out.println (random.get ());

        Supplier<String> s= () -> names.get (0);
        System.out.println (s.get () );

    }
}
