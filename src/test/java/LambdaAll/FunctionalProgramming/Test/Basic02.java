package LambdaAll.FunctionalProgramming.Test;

import LambdaAll.FunctionalProgramming.Interface.GreetingService;

public class Basic02 {
    //First Class Object
    public static void main(String[] args) {

        GreetingService g = a->a.toLowerCase ();
       // GreetingService is reference type
        //After = you create a function
        //Function assign to a variable as a reference type.
        //Assing to variable g
    }
}
