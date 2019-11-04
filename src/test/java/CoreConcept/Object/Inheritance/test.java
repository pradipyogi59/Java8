package CoreConcept.Object.Inheritance;



class Box11 {
    static {
        System.out.println(1);
    }

    private void sec(){
        System.out.println ("secret" );
    }

    protected  void medium(){
        sec ();
    }
}

class Box12 extends Box11 {
    static {
        System.out.println(2);
    }
}

class Box13 extends Box12 {
    static {
        System.out.println(3);
    }

}


public class test {

    public static void main(String[] args) {

        Box13 b = new Box13 ( );
        b.medium ();
        System.out.println (b );
    }
}
