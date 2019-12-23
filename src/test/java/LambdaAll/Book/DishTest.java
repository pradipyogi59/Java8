package LambdaAll.Book;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DishTest {

    public static void main(String[] args) {

        List<Dish> dishList=new ArrayList<> (  );
        dishList.add ( new Dish ( "potato",50,"veg" ) );
        dishList.add ( new Dish ( "paneer",100 ,"veg") );
        dishList.add ( new Dish ( "fish" ,150,"nonveg") );
        dishList.add ( new Dish ( "tand",70 ,"veg") );
        dishList.add ( new Dish ( "pizza",65,"nonveg" ) );



        List<String> collect = dishList.stream ( )
                .filter ( calories -> calories.getCalories ( ) < 150 ) //filter
                .sorted ( Comparator.comparing ( Dish::getCalories ))   //sort them by calories
                .map ( Dish::getName ) // get all names
                .collect ( Collectors.toList ( ) );

        System.out.println (collect );


        dishList.
                stream ( )
                .collect ( Collectors.groupingBy ( Dish::getType ) );

    }
}
