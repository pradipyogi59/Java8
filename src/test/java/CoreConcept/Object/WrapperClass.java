package CoreConcept.Object;

import java.util.ArrayList;
import java.util.List;

public class WrapperClass {

    public static void main(String[] args) {

        //Java is an Object oriented programming language so represent everything in the form of
        //the object, but java supports 8 primitive data types these all are not part of object.

        //To represent 8 primitive data types in the form of object form we required 8 java classes
        //these classes are called wrapper classes.

        //Byte,Short,Integer,Long,Float,Double,Character,Boolean : wrapper class

        Integer i0=new Integer ( 10 );
        Integer i2=new Integer ( "10" ); //conver to int
       // Integer i4=new Integer("pradip"); //java.lang.NumberFormatException:

        String i3=i0.toString ();
        //In java we are able to call toString() method only on reference type but not primitive type.


        //We can crate wrapper object in two ways
        //1. By using constructore object Integert i=new Integer();
        //2. By using valueOf() method.

        Integer i5=Integer.valueOf ( "16" );
        System.out.println (i5 );



       //Autoboxing & unboxing
        //Autoboxing: Converting a primitive value into an object of the corresponding wrapper class is called autoboxing.
        //Unboxing: Converting an object of a wrapper type to its corresponding primitive value is called unboxing.

        int id=Integer.valueOf ( 50 );
        Integer id2=5; //boxing
        int id3=i0; //unboxing

         /* Here we are creating a list
          of elements of Integer type.
          adding the int primitives type values */
        List<Integer> list = new ArrayList<Integer> ();
        for (int i = 0; i < 10; i++)
            list.add(i);

        //We are adding int primitive type values instead of Integer Object and the code successfully compiled
        //list.add(Integer.valueOf(i));
        //conver int to wrapper class .

        //Boxing
        byte b = 10;             //Primitive byte data
        Byte B = new Byte(b);   //Wrapping primitive byte data into Byte Object
        //AutoBoxing
        byte b2 = 10;    //Primitive byte data
        Byte B2 = b;    //Auto-Boxing of byte data

        //Unboxing
        Integer I = new Integer(15);    //Integer Object
        int i = I.intValue();           //Unwrapping Integer object to int data

        //Auto unboxing
        Integer I2 = new Integer(15);    //Integer Object
        int i23 = I2;                     //Auto-Unboxing of Integer Object


    }
}
