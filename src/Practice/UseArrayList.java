package Practice;

import java.util.ArrayList;

public class UseArrayList {
    public static void main(String[] args) {
        ArrayList<String> alist =new ArrayList<String>();
        alist.add("Steve");
        alist.add("Tim");
        alist.add("Lucy");
        alist.add("Pat");
        alist.add("Angela");
        alist.add("Tom");

        System.out.println(alist);

        alist.add(3,"Steve");

        System.out.println(alist);


    }









}
