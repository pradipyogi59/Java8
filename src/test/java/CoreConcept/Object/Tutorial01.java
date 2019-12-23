package CoreConcept.Object;

class Emp{


    {
        System.out.println ("Normal Block" );
    }
    static
    {
        System.out.println ("Static Block" );
    }


    Emp(){
        System.out.println ("Inside Cosntructore" );
    }


}
public class Tutorial01 {
    public static void main(String[] args) {
            new Emp ();
    }
}
