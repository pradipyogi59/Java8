package Java8Interface;

interface if1{

    default void method1(){
        System.out.println ("Method 1" );
    }
}

interface if2{

    default void method1(){
        System.out.println ("Method 2" );
    }
}
public class DefaultMethodInInterface implements if1,if2{

    public void method1(){
        System.out.println ("New Implementation" );
        //or
        //if1.super.method1 ();
    }

    public static void main(String[] args) {

        DefaultMethodInInterface b=new DefaultMethodInInterface ();
        b.method1 ();
    }


}
