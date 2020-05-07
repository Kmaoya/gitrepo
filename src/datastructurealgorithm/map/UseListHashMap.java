package datastructurealgorithm.map;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UseListHashMap {

    public static void main(String[] args) {

        List<String> stateOfUSA=new ArrayList<>();
        stateOfUSA.add("NY");
        stateOfUSA.add("NJ");
        stateOfUSA.add("VA");
        stateOfUSA.add("NC");
        stateOfUSA.add("CA");


        List<String> stateOfCANADA=new ArrayList<>();

        stateOfCANADA.add("ON");
        stateOfCANADA.add("Montreal");
        stateOfCANADA.add("ON");
        stateOfCANADA.add("ON");
        stateOfCANADA.add("ON");



        List<String> stateOfUK=new ArrayList<>();
        stateOfUK.add("LONDON");
        stateOfUK.add("LONDON");
        stateOfUK.add("LONDON");
        stateOfUK.add("LONDON");
        stateOfUK.add("LONDON");

        Map<String,List<String>> stMap=new HashMap<>();
        stMap.put("USA", stateOfUSA);
        stMap.put("CANADA", stateOfCANADA);
        stMap.put("UK",stateOfUK);

        for (Map.Entry<String, List<String>>entry : stMap.entrySet());

        System.out.println();


    }



}
