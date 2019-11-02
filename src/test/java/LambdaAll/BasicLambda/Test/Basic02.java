package LambdaAll.BasicLambda.Test;

import LambdaAll.BasicLambda.Interface.GreetingService2;

public class Basic02 {
    public static void main(String[] args) {

        GreetingService2 g1=greet->greet.toUpperCase ();
        //lambda returning value.

        String nameUpper=g1.greet ( "pradip" );
        System.out.println ("Name us : "+nameUpper );

    }
}
