package excephandling;

public class SalaryCalculation {



    public static void division() {
        try {
            int num1 = 4500;
            int num2 = 55;
            int div = num1 / num2;
            System.out.println("Division two value is " + div);

        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Arithmetic Exception");
            //username="kazi" kazi// user name does not match

        } finally {
            System.out.println("Division value is good");

        }


    }

    public static void doSummation() {

        int num1 = 45;
        int num2 = 55;
        int sum = num1 / num2;
        System.out.println("Sum of two value is " + sum);
    }



    public static void main(String[] args) throws ArithmeticException {
        SalaryCalculation.division();
        SalaryCalculation.doSummation();


    }
}












