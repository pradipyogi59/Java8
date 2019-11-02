package LambdaAll.BasicLambda.Interface;

@FunctionalInterface
//Annotation of SAM (lambda)
public interface GreetingService {
    //SAM : Sinle Abstract Method Interface

    void greet(String name);
}
