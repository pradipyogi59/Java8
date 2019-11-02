package LambdaAll.FunctionalProgramming.Test;

import LambdaAll.FunctionalProgramming.Interface.GreetingService;

import java.util.ArrayList;
import java.util.List;

public class Basic01 {
    public static void main(String[] args) {

        // Funcational Programming : Is a way of building software by using pure funcations and avoiding shared status & side effect.
        //Shared Status :  a variable being accessed by more than 1 function.
        //Side effect : function modifies the variable.

        //Pure funcation : give consistance o/p of given i/p
        // f(x)=x+3; its lambda , give me x i'll add 3 , consistance o/p of given i/p
        //f(x)=x+3+y; y is somewhere else, its depend on y , no consistance o/p , not a pure funcation.


        GreetingService g= name -> System.out.println ("Name is :" + name.toLowerCase () );
        g.greet ( "PRADIP" );
        //Getting consistance op

        List<String> names=new ArrayList<> ( 2 );
        names.add ( "Java" );
        names.add ( "Selenium" );


        GreetingService g2 =n-> {
            names.get ( 0 );
            System.out.println ("Data is : "+n.toLowerCase () +" " +names.get ( 0 ) );
        };
        //Here we depends on list so its inpure funcation.

        g2.greet ( "Hello PRADIP" );

        GreetingService g3 =n-> {
            names.remove ( 0 );
            System.out.println ("Data is : "+n.toLowerCase () +" " +names.get ( 0 ) );
        };
        //in g2 we try to get 0 index and in g3 we remove index. ao ites shared state and cause side effect. run un diff. thread then sometimes getting o/p and sometimes getting
        //index out of bound exception.


        /*
        * Funcational Programming : Key concept
        *
        * 1. Pure Funcation
        * 2. Funcation as a First class object
        * 3. Higher Order Funcations
        * */


    }
}
