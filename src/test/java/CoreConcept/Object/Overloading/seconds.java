package CoreConcept.Object.Overloading;

class company{

    public void getName(){
        System.out.println("name method in company");
    }

    public void getName(String name){
        System.out.println("name method in comapny with parameter");
    }
}

class supplier extends  company{

    public void getName(){
        System.out.println("name method in supplier");
    }

    public void getName(int i){
        System.out.println("name method in supplier with int");
    }

}

public class seconds {

    public static void main(String[] args) {

        company c=new supplier();
        c.getName();
    }
}
