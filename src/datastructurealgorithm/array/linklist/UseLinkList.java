package datastructurealgorithm.array.linklist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UseLinkList {
    //ArrayList vs linkList

    public static void main(String[] args) {
        List<String> fruitsName = new ArrayList<>();
        fruitsName.add("Apple");
        fruitsName.add("Orange");
        fruitsName.add("Melon");
        fruitsName.add("Mango");
        fruitsName.add("Cantalop");
        fruitsName.add("Grape");

        //Retrive  Data from ArrayList

        for (String f1 : fruitsName) {
            System.out.println(f1);
        }

        List<String> mobileBrand = new LinkedList<>();
        mobileBrand.add("Apple");
        mobileBrand.add("Samsung");
        mobileBrand.add("LG");
        mobileBrand.add("Nokia");

        for (String mb : mobileBrand) {
            System.out.println(mb);
        }


        pizzaListDetails();

    }

    static List<String> pizzaList = new LinkedList<>();

    public static void pizzaListDetails() {
        pizzaList.add("American pizza");
        pizzaList.add("Italian Pizza");
        pizzaList.add("Mexican pizza");


        for (String p1 : pizzaList) {
            System.out.println(p1);
        }
    }


}
