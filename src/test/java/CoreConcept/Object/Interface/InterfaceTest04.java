package CoreConcept.Object.Interface;


interface animal{

    default void bark(){
        System.out.println("barking");
    }

}

interface  tiger {

    default void bark(){
        System.out.println("barking");
    }
}


public class InterfaceTest04  implements tiger,animal{

    //if same default method available in both interface then compile time error
    //sollution
    //1.override method
    //2.or animal.super.bark()

    public void bark(){
        System.out.println("new imple ");
        //or
        animal.super.bark();
    }
    public static void main(String[] args) {

        tiger t=new InterfaceTest04();
        t.bark();

    }

}
