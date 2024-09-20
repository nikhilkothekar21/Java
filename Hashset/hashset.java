import java.util.*;
public class hashset{
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        //Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        System.out.println(set);


        //Search - contains
        if(set.contains(1)){
            System.out.println("Set contains 1");
        }
        if(!set.contains(6)){
            System.out.println("Does not contains 6");
        }

        set.remove(1);
        if(!set.contains(1)){
            System.out.println("We removed 1");
        }

        System.out.println("Size of set:" + set.size());

        //Iterator
        Iterator it = set.iterator();
        //hasNext

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}