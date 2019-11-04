package JavaProgramPractice;





import com.sun.xml.internal.ws.util.StringUtils;

import java.util.*;

public class test {

    public static  void main(String args[]){


        ////reversed string using Stringbuffer
        //        String reverseStr = new StringBuffer(str).reverse().toString();



//        String name="Pradip Yogi";
//        String reverse="";
//
//        char[] all=name.toCharArray();
//
//        for (int i=name.length()-1;i>=0;i--)
//        {
//            System.out.print(all[i]);
//        }

//
//        String name="Pradip Yogi";
//        String[] n=name.split("");
//        String neee="";
//
//        for (int i=name.length()-1;i>=0;i--){
//
//            //System.out.print(n[i]);
//            neee=neee+n[i];
//        }
//
//        System.out.println(neee);
//

//
//       String name="Pradip";
//       char[] n=name.toLowerCase().toCharArray();
//
//        HashSet<Character> h1=new HashSet<>();
//        for (char t:n){
//
//            if (h1.add(t)==false){
//                System.out.println("Duplicate values are :"+t);
//            }
//
//        }
//        HashMap<Character,Integer> m=new HashMap<>();
//        for (char cc:n){
//
//            if (m.containsKey(cc)){
//                m.put(cc,m.get(cc)+1);
//            }else
//            {
//                m.put(cc,1);
//            }
//        }
//        Set<Map.Entry<Character,Integer>> s2=m.entrySet();
//        for (Map.Entry<Character, Integer> entry:s2){
//
//            if (entry.getValue()>1)
//                System.out.println(entry.getKey()+""+entry.getValue());
//        }


        //public static char getFirstNonRepeatedChar(String str) {
        //        Map<Character,Integer> counts = new LinkedHashMap<>(str.length());
        //
        //        for (char c : str.toCharArray()) {
        //            counts.put(c, counts.containsKey(c) ? counts.get(c) + 1 : 1);
        //        }
        //
        //        for (Entry<Character,Integer> entry : counts.entrySet()) {
        //            if (entry.getValue() == 1) {
        //                return entry.getKey();
        //            }
        //        }
        //        throw new RuntimeException("didn't find any non repeated Character");
        //    }



//        String namee="Struggle12for5andind829";
////        String s="";
////        String[] arr=namee.split("[0-9]+");
////        for (String t:arr){
////            System.out.print(t);
////        }
//        String ne=namee.replaceAll("\\d"," ");
//        System.out.println(ne);

//        String n="pradip yogi is name";
//        char[] a=n.toCharArray();
//        Arrays.sort(a);
//        System.out.println(a);
//        String sorted=new String(a);

        //2 string are Anagram or not.
//        String s1="gullu";
//        String s2="lgluu";
//
//
//        char[]ch1=s1.toCharArray();
//        char[]ch2=s2.toCharArray();
//
//        Arrays.sort(ch1);
//        Arrays.sort(ch2);
//
//        String s3=new String(ch1);
//        String s4=new String(ch2);
//
//        if(s3.equals(s4)){
//            System.out.println("Anagram");
//        }
//        else
//            System.out.println("Not a Anagram");
//    }


        //char[] charFromWord = word.toCharArray();
        //        char[] charFromAnagram = anagram.toCharArray();
        //        Arrays.sort(charFromWord);
        //        Arrays.sort(charFromAnagram);
        //
        //        return Arrays.equals(charFromWord, charFromAnagram);

        //find length of a string without using length().

//        String s1 = "ptutorial";
//        int i = 0;
//        for(char c: s1.toCharArray()){
//            i++;
//        }


        ////counting occurrence of character with loop
        //        int charCount = 0;
        //        for(int i =0 ; i<input.length(); i++){
        //            if(input.charAt(i) == 'a'){
        //                charCount++;
        //            }
        //        }
        //charCount = 0; //resetting character count
        //        for(char ch: input.toCharArray()){
        //            if(ch == 'a'){
        //                charCount++;
        //            }
        //        }
        //
        //Read more: https://javarevisited.blogspot.com/2012/12/how-to-count-occurrence-of-character-in-String.html#ixzz5zrzMpYpI



        //int to string : String price = "" + 123;




    }
}
