package LambdaAll.Book;

public class Dish {

    String name;
    int calories;
    String type;

    Dish(String name,int calories,String type){
        this.name=name;
        this.calories=calories;
        this.type=type;
    }


    int getCalories(){
        return calories;
    }

    String getName(){
        return name;
    }

    String getType(){
        return type;
    }

}
