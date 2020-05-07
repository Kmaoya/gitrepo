package datastructurealgorithm.array;

import java.util.ArrayList;

public class UseArrayList {

    //ArrayList: No need to declare Array size/ dynamic Array
    // ArrayList type Array object

    static ArrayList<String> stName=new ArrayList<>();

    static String[] studentName=new String[5000];

    public static void main(String[] args) {

        stName.add("Anika Islam");
        stName.add("James willam ");
        stName.add("Ruporshri bhowmic");
        stName.add("Kazi Maoya");
        stName.add("Arshil bashar");

        System.out.println(stName.get(1));
        System.out.println("***********");

        for (String st:stName) {
            System.out.println(st);
        }



    }



}
