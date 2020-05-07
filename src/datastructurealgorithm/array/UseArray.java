package datastructurealgorithm.array;

public class UseArray {
    String address; //Declare variable
    String name = "Kazi"; //Declare and Initialize

    //Declare and Initialize
    static String[] stName = {"Sami", "Tigist", "Denys", "Nafis", "matt"};

    //Array Declare
    static String[] stAddress = new String[6];

    public static void main(String[] args) {
//Array Index start from Zero(0)

        System.out.println("Length is : " + stAddress.length);
        stAddress[0] = "Queens,NY";
        stAddress[1] = "Brooklyn,NY";
        stAddress[2] = "Jamaica,NY";
        stAddress[3] = "Bronx,NY";
        stAddress[4] = "Woodside,NY";
        stAddress[5] = "Elmhurst,NY";
        // stAddress[6] = "Long Island,NY";
        // stAddress[7] = "Jackson Heights,NY";
        try {
            System.out.println(stAddress[5]);
            System.out.println(stAddress[3]);
            System.out.println(stAddress[3].toUpperCase());

        } catch (Exception e) {
            e.printStackTrace();

            System.out.println("Array Index out of Bounds Exception");


        }
        System.out.println("******** Using For Loop*****");


        for (int i = 0; i < stAddress.length; i++) {
            System.out.println(stAddress[i]);
        }

        for (int i = 0; i < stName.length; i++) {
            System.out.println(stName[i]);
        }

        System.out.println("******** Using for Each Loop*******");

        //for (Datatype variableName:arrayName)( system.out.println(VariableName)

        for (String st : stAddress) {
            System.out.println(st);
        }

        int[] number = {2, 4, 6, 7, 9};

        for (int num : number) {
            System.out.println(num + " ");

        }
    }
}