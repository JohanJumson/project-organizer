package View;

public class View {

    public static void mainView(){

        System.out.println("\t\t\t*** Welcome in the Mathematical operations ***");
        System.out.println("\t\t\t-> Enter  1  to perform the division operation.");
        System.out.println("\t\t\t-> Enter  2  to perform the multiply operation.");
        System.out.println("\t\t\t-> Enter  3  to perform the addition operation.");
        System.out.println("\t\t\t-> Enter  4  to perform the subtraction operation.");
        System.out.println("\t\t\t-> Enter  5  to perform the remainder operation.");
        System.out.println("\t\t\t-> Enter  6  to exit the programme.");

    }



    public static void firstOperation(){

        System.out.println("\t1-  Enter the first number.");
        System.out.println("\tThe first number has been entered successfully.");
    }

    public static void secondOperation(){

        System.out.println("\t2-  Enter the second number.");
        System.out.println("\tThe second number has been entered successfully.");

    }

    public static void mathematicalProcess (){

        System.out.println("\tWelcome to the division process");

    }

    public static void mathematicalProcess2 (){

        System.out.println("\tWelcome to the Multiplication process ");

    }

    public static void additionProcess (){
        System.out.println("\tWelcome to the addition process");
    }
    public static void subtractionProcess (){
        System.out.println("\tWelcome to the subtraction process");
    }

    public static void remainderProcess (){
        System.out.println("\tWelcome to the remainder process");
    }

    public static void error(){
        System.out.println("There error");
        System.out.println("Enter the correct operation number\n");
    }

}
