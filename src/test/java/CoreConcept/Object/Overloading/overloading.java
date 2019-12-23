package CoreConcept.Object.Overloading;


class Wfa{

    public void amount(String amount){
        System.out.println("Amount String is :"+amount);
    }

    public void amount(int amount){
        System.out.println("Amount Int is :"+amount);
    }


    //In java, method overloading is not possible by changing the return type of the method only because of ambiguity. Let's see how ambiguity may occur:
  //  static int add(int a,int b){return a+b;}
    //static double add(int a,int b){return a+b;}


    //


}

public class overloading {

    public static void main(String args[]){

        Wfa w=new Wfa();
        w.amount(10);
        //In overloading method resolution always take care by compiler based on reference type.
        //Also knows as compile type polymorphism
        //Static polymorphism
        //early Binding
        //Here reference type is very imp. & runtime object is dummy.
        //return type is not problem in method overloading


        //Two method having same name with different parameter (arguments) called method overloading

        //By Type promotion is method overloading, we mean that one data type can be promoted to another implicitly if no exact matching is found.
        //https://prnt.sc/qel5f7

        //void sum(int a,long b){System.out.println("a method invoked");}
        //void sum(long a,int b){System.out.println("b method invoked");}
        //There are two methods defined with the same name, i.e., sum. The first method accepts the integer and long type whereas the second method accepts long and the integer type. The parameter passed that are a = 20, b = 20. We can not tell that which method will be called as there is no clear differentiation mentioned between integer literal and long literal. This is the case of ambiguity. Therefore, the compiler will throw an error.

    }
}