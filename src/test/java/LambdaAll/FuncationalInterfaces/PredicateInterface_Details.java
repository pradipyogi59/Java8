package LambdaAll.FuncationalInterfaces;

import java.util.Scanner;
import java.util.function.Predicate;

class User{

    String id;
    String pw;
    User(String a,String b){
        id=a;
        pw=b;
    }
}

public class PredicateInterface_Details {

    public static void main(String[] args) {

        //Returns boolean value. based on some condition.
        //Contain one abstract method : test();
        //Predicate is boolean value function.

        //negate(),and(),or() are default method in predicate interface.
        //static isEqual() method

        //Two or more predicate join to sinle predicate its called predicate joining.

        String[] names={"java","net","python","javaScript","jCharm","php"};
        Predicate<String> startsWith = n->n.charAt ( 0 ) == 'j';

        for (String s: names)
        {
            if (startsWith.test ( s )){
                System.out.println (s );
            }
        }

        Predicate<String> p1=Predicate.isEqual ( "pradip" );
        System.out.println (p1.test ( "pradip" ) );
        System.out.println (p1.test ( "data" ) );


        User[] userArray={new User ( "a","a1" ),new User ( "b" ,"b1")};
        Predicate<User> u2=a1->a1.id=="a";
        for (User h:userArray){
            if (u2.test ( h )){
                System.out.println ("Found" );
            }
        }


        Predicate<User> authenticate= c->c.id.equals ( "pradip" ) && c.pw.equals ( "divy" );

        Scanner s=new Scanner(System.in);
        System.out.println ("Enter id : " );
        String un=s.nextLine ();
        System.out.println ("Enter password : " );
        String pw=s.nextLine ();
        User u=new User ( un,pw );

        if (authenticate.test(u)){
            System.out.println ("User Authenticated" );
        }else
        {
            System.out.println ("Authentication failed" );
        }

    }
}
