package LambdaAll.FunctionalProgramming.Test;

import LambdaAll.FunctionalProgramming.Interface.GreetingService;

public class Basic04 {
    public static void main(String[] args) {

        GreetingService g=getLamb ();
        g.greet ( "pradip" );
        //or
        getLamb ().greet ( "data" );

        //Funcation assign to variable called Funcation as a First class object

    }


    private static GreetingService getLamb(){
        return p->p.toUpperCase ();
        //return lambda
    }
}
