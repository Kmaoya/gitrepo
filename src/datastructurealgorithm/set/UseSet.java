package datastructurealgorithm.set;

import java.util.HashSet;
import java.util.Set;


public class UseSet {

   //Set ia an interface  which extends collection.It is an unorder

    //which duplicate values can not be stored

    //set is implemented by HashSet,LinkedHashset or TreeSet


    public static void main(String[] args) {
        Set<String> name=new HashSet<String>();
        name.add("Sam");
        name.add("Denys");
        name.add("Anas");
        name.add("Karim");
        name.add("Hakim");
        name.add("Anas");

        System.out.println(name);
        name.remove("Karim");
        System.out.println(name);
        System.out.println(name.contains("Dens"));

    }




}
