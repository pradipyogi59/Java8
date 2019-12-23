package JavaProgramPractice.StringProgram;

import java.util.Arrays;

public class String09_Anagram {
    public static void main(String[] args) {

        String s1="pradip";
        String s2="pidarp";


        char[]ch1=s1.toCharArray();
        char[]ch2=s2.toCharArray();

        System.out.println(s1.length());
        System.out.println(ch1.length);

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        String s3=new String(ch1);
        String s4=new String(ch2);

        if(s3.equals(s4)){
            System.out.println("Anagram");
        }
        else
            System.out.println("Not a Anagram");


    }

}
