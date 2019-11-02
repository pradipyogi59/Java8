package Java8Interface;

interface a{

    static void getNumber() {
        System.out.println ("Number is 5" );
        //To define general utility method.
        //Interface static method by default not available in implementation class.
        //So there are no overriding in static method of interface.
        //How To call interface static method name : interfaceName.StaticMethodName

        //you can use main method and run interface bcoz of from 1.8 interface can contain static method including main.
    }
}

public class StaticMethodInInterface implements a{

    public static void main(String[] args) {

        StaticMethodInInterface s=new StaticMethodInInterface ();
       // s.getNumber(); not possible
        a.getNumber ();
    }

}
