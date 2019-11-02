package LambdaAll.FunctionalProgramming.Test;


import LambdaAll.FunctionalProgramming.Interface.GreetingService;

public class Basic03 {
    //Higher order funcation
    //Lambda is not executable code its just implementation.
    public static void main(String[] args) {

        GreetingService g1= n-> System.out.println (n.toLowerCase ());

        test ( g1 );
        //also
        test ( n-> System.out.println (n.substring ( 1 ) ));
        //test method can receive another function as parameter
        //Passing behaviour as parameter to method (before java 8 its not possible)
    }

    private static void test (GreetingService g){
        //a method can receive another function as parameter is a higher order function.
        g.greet ( "PRADIP" );
    }

    public static class Basic04 {
        //Higher Order funcation 2
        public static void main(String[] args) {

            String name="pradip";
            toUpperCase ( name );
            //normally we do

           GreetingService g1=p->p.toUpperCase ();
           test(g1);
           test(n->n.length ());



        }

        private static void toUpperCase(String s)
        {
            //method say give me data i'll give yo modified data.
            String upper=s.toUpperCase ();
            //s.toUpperCase() is behavious
            System.out.println (upper );
        }

        private static void  test(GreetingService g){

            g.greet ( "pradip" ) ;
            //i'll give you data you tell me what i have to do.
        }
    }
}
