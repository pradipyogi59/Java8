package LambdaAll.BasicLambda.Test;

import LambdaAll.BasicLambda.Interface.GreetingService;

public class Basic01 {
    public static void main(String[] args) {

        //create implement of interface
        GreetingService g1 = new GreetingService ( ) {
            public void greet(String name) {
                System.out.println ("Name is :"+name );
            }
        };

        g1.greet ( "Hello" );


        GreetingService g2=a-> System.out.println ("Name is :"+a );

        //Original
        //        GreetingService g3=(String name) ->{
        //            System.out.println ("Name is :"+name );
        //        };
        //If it is one line you can remove {}
        //And if it is multiline then use {}
        //Parameter type is optional (String name) can be (name) & if it is one parameter then remove () so name


        //Lambda Condtion : Only condition is interface having only one abstract method.
        //So we can say Lambda is simple declaration or implementation of interface.
        //Lambda is body of method


        //Anonymous function : that is declared without any name.Assigned to a variable,

        //Convert normal funcation to lambda : remove access modifier,return type and name







    }
    }

