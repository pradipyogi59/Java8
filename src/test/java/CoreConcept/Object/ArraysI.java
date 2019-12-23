package CoreConcept.Object;

import java.util.Arrays;

public class ArraysI {

    public static void main(String[] args) {

        int[] num = new int[10];
        for (int i = 0; i < 10; i++) {
            num[i] = i + 5;
        }
        //readArrays ( num );

        int[] newArrays = Arrays.copyOf ( num, 5 );
        readArrays ( newArrays );

        //adding different types Objects in Object array

        Object[] mixure = new Object[10];
        mixure[0] = "pradip";
        mixure[1] = 10;

        for (Object s : mixure)
        {

        }
    }

    public static void readArrays(int[] arr){

        for(int i:arr)
        {
            System.out.println ("Arrays values is :"+i );
        }
    }


}
