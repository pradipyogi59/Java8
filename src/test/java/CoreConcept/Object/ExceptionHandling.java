package CoreConcept.Object;

public class ExceptionHandling {

    //The main objective of exception handling is to get normal termination of the application in order to
    //execute rest of the application code.

    //In java we are having two approaches to handle the exceptions.
    //1) By using try-catch block.
    //2) By using throws keyword.


    //Exception handling means just we are providing alternate code to continue the execution of
    //remaining code and to get normal termination of the application.

    //Types of Exceptions:-
    //1) Checked Exception
    //2) Unchecked Exception
    //3) Error

    //checked Exception:-
    // The Exceptions which are checked by the compiler at the time of compilation is called Checked
    //Exceptions.
    //IOException,SQLException,InterruptedException........etc

    //If the application contains checked exception the code is not compiled so must handle the checked
    //Exception in two ways
    //o By using try-catch block.
    //o By using throws keyword.

    //Unchecked Exception:-
    // The exceptions which are not checked by the compiler at the time of compilation are called
    //unchecked Exception.
    //ArithmeticException,ArrayIndexOutOfBoundsException,NumberFormatException....etc

    //Errors are caused due to lack of system resources like,
    //o Heap memory full.
    //o Stack memory problem.
    //o AWT component problems.....etc
    //Ex: - StackOverFlowError, OutOfMemoryError, AssertionError............etc

    //Exceptions are caused due to developers mistakes or end user supplied inputs but errors are
    //caused due to lack of system resources.

    //We are handle the exceptions by using try-catch blocks or throws keyword but we are unable to
    //handle the errors.
    //Test[] t = new Test[100000000];


    //Exception handling key words:-
    //1) try
    //2) catch
    //3) finally
    //4) throw
    //5) throws

    public static void main(String[] args) {

//        try{
//            System.out.println ("inside try"+10/0 );
//        }catch (ArithmeticException e)
//        {
//            System.out.println ("catch 10/o" );
//        }
//        System.out.println ("End of 1st" );


//        try{
//            System.out.println ("inside try"+10/0 );
//        }catch (NullPointerException e)
//        {
//            System.out.println ("handle with null pointer catch 10/o" );
//        }
//        System.out.println ("End of 2nd" );
        //error

//        try{
//            System.out.println ("inside try" );
//        }catch (ArithmeticException e)
//        {
//            System.out.println ("if no error then catch block not execute" );
//        }
//        System.out.println ("End of 3rd" );

        //in Exception handling independent try blocks are not allowed must declare try-catch ortry-
        //finally or try-catch-finally.

//        try
//        {
//            System.out.println ("hi" );
//        };

        //In between try-catch blocks it is not possible to declare any statements must declare try with
        //immediate catch block.

        //In below example exception raised in catch block hence program is terminated abnormally.

//        try{
////            System.out.println ("inside try"+10/0 );
////        }catch (ArithmeticException e)
////        {
////            System.out.println ("catch 10/o" +10/0);
////        }

        // If the exception raised in try block remaining code of try block won’t be executed.
        //Once the control is out of the try block the control never entered into try block once again.

//        try{
//
//            System.out.println (10/0 );
//            System.out.println ("inside try check me" );
//
//        }catch (ArithmeticException e)
//        {
//            System.out.println ("if no error then catch block not execute" );
//        }

        //The way of handling the exception is varied from exception to the exception hence it is recommended
        //to provide try with multiple number of catch blocks.

        //By using Exceptional catch block we are able to hold any type of exceptions.
        //catch(Exception e)

        //:-if we are declaring multiple catch blocks at that situation the catch block order should
        //be child to parent shouldn’t be parent to the child.

//        try{
//
//            System.out.println (10/0 );
//            System.out.println ("inside try check me" );
//
//        }catch (Exception e)
//        {
//            System.out.println ("if no error then catch block not execute" );
//        }catch (ArithmeticException e1){
//
//        }
        //compile time error

//        try
//        {
//            try
//            {
//
//            }catch (Exception e){
//
//            }
//        }catch (Exception e){
//
//        };
        //valid nested

//        try
//        {
//
//        }catch (Exception e){
//            try{
//
//            }catch (Exception e1){
//
//            }
//        };
        //valid

        //It is possible to combine two exceptions in single catch block the syntax is
        //catch(ArithmeticException | StringIndexOutOfBoundsException a) .
        //but 2nd or 1st is if Exception then compile time error.


        //Finally block:-
        //1) Finally block is always executed irrespective of try and catch.
        //2) It is used to provide clean-up code

        //try -finally valid

        //if the exception raised in try block the JVM will search for corresponding catch block ,
        // If the corresponding catch block is matched the catch block is executed then finally block is
        //executed.
        // If the corresponding catch block is not matched the program is terminated abnormally just
        //before abnormal termination the finally block will be executed then program is terminated
        //abnormally.



//        try
//        {
//            System.out.println ("Finally test" );
//            System.out.println (10/0 );
//        }catch (NullPointerException e)
//        {
//            System.out.println ("inside exception handling" );
//        }
//        finally {
//            System.out.println ("inside finally" );
//        }

//        try
//        {
//            System.out.println ("Finally test me" );
//        }catch (NullPointerException e)
//        {
//            System.out.println ("inside exception handling me" );
//        }
//        finally {
//            System.out.println ("inside finally"+10/0 );
//        }
        //Problem in finally block





//            try{
//
//                System.out.println ("hi"+10/0 );
//            }finally {
//
//                System.out.println ("finally" );
//            }
//runtime error

//        try{
//
//            System.out.println ("hi" );
//        }finally {
//
//            System.out.println ("finally" );
//        }

        //valid



        //Example:-in only two cases finally block won’t be executed

        //Case 1:- whenever we are giving chance to try block then only finally block will be executed otherwise
        //it is not executed. (if try block not execute then finally not execute (error before try block))

        //Case 2:-In your program whenever we are using System.exit(0) the JVM will be shutdown hence the
        //rest of the code won’t be executed (inside try write System.exit(0))



    }


}
