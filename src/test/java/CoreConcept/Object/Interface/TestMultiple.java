package CoreConcept.Object.Interface;

interface i1{

    void A1();
    void A2();
    void A3();
    void A4();
}

abstract class ab1 implements i1 {

    public void A1(){
        System.out.println ("Abstract class ab1" );
    }

    public static void ab1_method1(){
        System.out.println ("Concrete static method of ab1" );
    }

}

abstract class ab2 implements i1{

    public void A2(){
        System.out.println ("Abstract class ab2" );
    }

    public void ab2_method1(){
        System.out.println ("Concrete method of ab2" );
    }

    public static void ab2staic_method1(){
        System.out.println ("Concrete static method of ab2" );
    }
}

abstract class ab3 extends ab2{

    public void A3(){
        System.out.println ("abstracr class ab3" );
    }

    public void A4(){
        System.out.println ("abstract class ab3" );
    }
}


public class TestMultiple extends ab3{
    @Override
    public void A1() {
        System.out.println ("TEst Method" );
    }

    public static void main(String[] args) {

//        TestMultiple tm=new TestMultiple ();
//         ab2staic_method1 ();


         i1 inter=new TestMultiple ();
         inter.A1 ();


    }


}
