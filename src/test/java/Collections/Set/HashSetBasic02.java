package Collections.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetBasic02 {
    public static void main(String[] args) {

        //Duplicate values are not allowed in HashSet.
        //One NULL element is allowed in HashSet.
        //HashSet is not synchronized.
        //It is un-ordered collection and makes no guarantees as to the iteration order of the set.
        //Default initial capacity is 16. We can override this default capacity by passing default capacity in it’s constructor HashSet(int initialCapacity).

        //1. Create HashSet
        HashSet<String> hashSet = new HashSet<>();


//2. Add elements to HashSet
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("D");
        hashSet.add("E");

        System.out.println(hashSet);

//3. Check if element exists
        boolean found = hashSet.contains("A");        //true
        System.out.println(found);

//4. Remove an element
        hashSet.remove("D");

//5. Iterate over values
        Iterator<String> itr = hashSet.iterator();

        while(itr.hasNext())
        {
            String value = itr.next();

            System.out.println("Value: " + value);
        }

        //HashSet is very much like ArrayList class. It additionally restrict the duplicate values. So when we have a requirement where we want to store only distinct elements, we can choose HashSet.

        //HashSet vs TreeSet
        //It is very similar to HashSet class, except it stores the element in sorted order.
        //NULL is not allowed in TreeSet
        //It is an ordered collection which store the elements in sorted order.
    }
}
