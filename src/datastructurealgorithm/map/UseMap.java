package datastructurealgorithm.map;
import java.util.Map;
import java.util.HashMap;

public class UseMap {

    //Map:<Key,value>
    //Map<String, String>
    //name is Key
    //"Denys"

    public static void main(String[] args) {

       Map<String, String> stateMap=new HashMap<>();
        stateMap.put("USA","NY");
        stateMap.put("CANADA","ON");
        stateMap.put("JAPAN","TOKYO");
        stateMap.put("INDIA","DELHI");
        stateMap.put("BANGLADESH","DHAKA");

        //Retrive Value from Map

        for ( Map.Entry<String,String> entry : stateMap.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());

        }

        //Another Approach to get value

        System.out.println(stateMap.get("USA"));
        System.out.println("Another approach to get value");

        for (String st:stateMap.keySet()) {

            System.out.println(st+" :"+stateMap.get(st));


        }

    }




}
