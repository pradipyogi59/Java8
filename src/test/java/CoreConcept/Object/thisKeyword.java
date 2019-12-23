package CoreConcept.Object;

class a{
int a=10;
}

class b extends a{
    int a=20;
}

class c extends b{
    int a=30;

}
public class thisKeyword extends c{
    /*
    this can be used to refer current class instance variable.
this can be used to invoke current class method (implicitly)
this() can be used to invoke current class constructor.
this can be passed as an argument in the method call.
this can be passed as argument in the constructor call.
this can be used to return the current class instance from the method.
     */
    int a=40;
    public static void main(String[] args) {
        thisKeyword s=new thisKeyword();
        s.show();
    }

    public void show(){
        System.out.println(super.a);
    }

//    int a;
//    static int b;
//
//    thisKeyword(){
//
//        this.a=5;
//        this.b=6;
//    }
//
//
//    public void eat(int z){
//        int a;
//        this.a=z;
//    }
}


/*

super can be used to refer immediate parent class instance variable.
super can be used to invoke immediate parent class method.
super() can be used to invoke immediate parent class constructor.


constructor chaining be done with super and this with both you can chain constructore.

 The super() is implicitly invoked by the compiler if no super() or this() is included explicitly within the derived class constructor. Therefore, in this case, The Person class constructor is called first and then the Employee class constructor is called.

 Can you use this() and super() both in a constructor? No

 */