package CoreConcept.Object.Interface;

interface i{

    void method1();
    void metho2();
    static void method3()
    {}
}

public class Interface2 implements i{


    @Override
    public  void method1() {

    }

    @Override
    public void metho2() {

    }

//    public static void method3(){
//        //not overridden   .. interface static method not overriden
//    }


    public static void main(String[] args) {

        Interface2 i2=new Interface2 ();
        i2.method1 ();


       // i2.method3 (); not possible

        i.method3 ();
        //To use a static method, Interface name should be instantiated with it, as it is a part of the Interface only.

    }
}
