package Java8Interface;

abstract class ab1{

    public void m1(){
        System.out.println ("Inside m1" );
    }

    private void m2(){
        System.out.println ("Private" );
    }
}

public class test extends ab1{


    public static void main(String[] args) {
        test t =new test ();
        t.m1 ();
    }

    //why private modifier in abstract class
    /*
    public abstract class AbstractDAO{

public void save(){
  validate();
  //save
}

  private void validate(){ // we are hiding this method
  }

}
    * */
}
