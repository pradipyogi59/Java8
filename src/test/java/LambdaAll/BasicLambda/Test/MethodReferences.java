package LambdaAll.BasicLambda.Test;

import LambdaAll.BasicLambda.Interface.GreetingService;
import LambdaAll.BasicLambda.Interface.GreetingService3;

public class MethodReferences {

    public static void main(String[] args) {

        //Useful for single line lambda

        GreetingService g= System.out::println;

        g.greet ( "Pradip" );


        //For null checking s-> Objects.isNull(s);
        //String::toUpperCase : toUpperCase is instance method ,its direct invoke for given(String) object
        //String::concat for two input string concat :


        GreetingService3 g3=(p,q,r) -> p.concat ( q ).concat ( r );
        String fName=g3.concat ( "pradip","lavjibhai","yogi" );
        System.out.println (fName );







    }
}
