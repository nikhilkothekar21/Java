import java.util.*;
class hashmap{
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        
        // Insertion
        map.put("India",120);
        map.put("US",30);
        map.put("China",150);

        System.out.println(map);

        //Updation
        map.put("China",180);
        System.out.println(map);

        //Search
        if(map.containsKey("US")){
            System.out.println("It is present");
        }
        else{
            System.out.println("It is not present");
        }

        //To get the value of the key.
        System.out.println(map.get("China"));

        //To get all the key value pairs
        //for(int val : arr)
        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
            // System.out.println(e.getValue());
        }
    }
}