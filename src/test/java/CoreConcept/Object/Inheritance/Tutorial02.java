package CoreConcept.Object.Inheritance;


import java.util.ArrayList;
import java.util.List;

public class Tutorial02{
    public static void main(String[] args) {

   List a= new ArrayList (  );
   a.add ( "pradip" );
   a.add ( 1 );

        System.out.println (a.get ( 0 ) instanceof Object);
    }
}
