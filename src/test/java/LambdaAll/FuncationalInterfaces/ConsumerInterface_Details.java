package LambdaAll.FuncationalInterfaces;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerInterface_Details {
    public static void main(String[] args) {

        //input type : T
        //Return type : void
        //Method : aacept
        //chaining : andThen
        //Bi Type : BiConsumer<T,R>

        //Inside java.util.funcation package

        Consumer<String> names=(s)-> System.out.println (s );
        Consumer<String> names2=(s)-> System.out.println ("Second time is :"+s );

        names.accept ( "Pradip" );
        names.andThen(names2).accept ( "Two times" );

        BiConsumer<String,String> n=(a,b)->{
            String n1=a.concat ( b );
            System.out.println (n1 );
        };
        n.accept ( "Pradip","Yogi" );



    }
}
