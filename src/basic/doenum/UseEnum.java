package basic.doenum;


public class UseEnum {

    // Enum: Enum declaration can be done outside of a class or inside a class but

    // not inside a method
    //Enum vs class
    //
    // An Enum can just like a class have attributes and methods
    //Enum constants are public,static,final,unchangeable can not be override
    //An enum can not be used to create objects and it can not extends other
    //classes but
    //it can implement interfaces

    //Use enums when you have values that you are not going to change
    // Ex:Days,colors


    public enum Color {

        Red,Blue,Yellow,Green;

        public static void display() {
            System.out.println("Display is Good");
        }

    }



    public static  void main(String[] args) {
        System.out.println(Color.Red);// Call by enum name

        Color.display();
        System.out.println(Level.High);

    }
}

