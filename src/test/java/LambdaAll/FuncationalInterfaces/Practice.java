package LambdaAll.FuncationalInterfaces;

import java.util.ArrayList;
import java.util.function.Supplier;

class Bill{

    int number;
    String SupplierName;

    Bill(int number,String SupplierName){
        this.number=number;
        this.SupplierName=SupplierName;
    }

    public String getSupplierName(){
        return SupplierName;
    }

    public int getNumber(){
        return number;
    }

}


public class Practice {

    public static void main(String[] args) {

        Supplier<Integer> s1=() ->{
            return 5;
        };

        int a=s1.get ();
        System.out.println (a );

        Supplier<ArrayList<Bill>> sb= ()-> {
            ArrayList<Bill> a1=new ArrayList<>();
            a1.add ( new Bill ( 1,"ABC" ) );
            a1.add ( new Bill ( 2,"Pc Complete" ) );
            return a1;
        };

        ArrayList<Bill> sbi=sb.get ();
        System.out.println (sbi.get ( 0 ).SupplierName );



    }
}
