package LambdaAll.Book;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Dish2Test {

    public static void main(String[] args) {

//        List<Dish> menu = Arrays.asList(
//                new Dish2("pork", false, 800, Dish.Type.MEAT),
//                new Dish2("beef", false, 700, Dish.Type.MEAT),
//                new Dish2("chicken", false, 400, Dish.Type.MEAT),
//                new Dish2("french fries", true, 530, Dish.Type.OTHER),
//                new Dish2("rice", true, 350, Dish.Type.OTHER),
//                new Dish2("season fruit", true, 120, Dish.Type.OTHER),
//                new Dish2("pizza", true, 550, Dish.Type.OTHER),
//                new Dish2("prawns", false, 300, Dish.Type.FISH),
//                new Dish2("salmon", false, 450, Dish.Type.FISH) );

        String[] arrayOfWords = {"Goodbye", "World"};

        Stream<String> streamOfwords = Arrays.stream(arrayOfWords);



    }
}
