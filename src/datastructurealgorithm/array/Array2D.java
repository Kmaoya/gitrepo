package datastructurealgorithm.array;

public class Array2D {
    //MultiDimensional array/ 2D Array

    //datatype[1st Dimension] [2nd Dimension] = new datatype[size1] [size2]

    static String[][] stName = new String[4][3];

    static String[][] stAddress = {
            //Row 3
            // Column
            {"Si", "firstName", "lastName", "stAddress"},
            {"1", "James", "william", "Queens,NY"},
            {"2", "Jack", "mazii", "Jamaica,NY"},
            {"3", "Alex", "Zillan", "Bronx,NY"},

    };

    public static void main(String[] args) {
        System.out.println(stName.length);
        System.out.println(stAddress.length);

        stName[0][0] = "Si";
        stName[0][1] = "firstName";
        stName[0][2] = "lastName";
        stName[0][3] = "stAddress";

        stName[1][0] = "1";
        stName[1][1] = "firstName";
        stName[1][2] = "lastName";
        stName[1][3] = "stAddress";

        stName[2][0] = "2";
        stName[2][1] = "firstName";
        stName[2][2] = "lastName";
        stName[2][3] = "stAddress";

        System.out.println(stName[2][0]);
        for (String[] std : stName) {


        }


    }
}
