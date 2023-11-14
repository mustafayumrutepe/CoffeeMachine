import java.util.Scanner;

public class CoffeeMachine {

    public static Scanner scanStr=new Scanner(System.in);
    public static Scanner scanInt=new Scanner(System.in);
    public static String coffee1="Turkish coffee";
    public static String coffee2="Filter Coffee";
    public static String coffee3="Espresso";

    public static void main(String[] args) {

        System.out.print("\t1 "+coffee1+"\n\t2 "+coffee2+"\n\t3 "+coffee3+"\nWhich coffee would you like? : ");
        boolean continuation=true;

        do {int getInt=scanInt.nextInt();
            switch (getInt) {
                case 1:
                    milk(coffee1);
                    sugar(coffee1);
                    break;
                case 2:
                    milk(coffee2);
                    sugar(coffee2);
                    break;
                case 3:
                    milk(coffee3);
                    sugar(coffee3);
                    break;
                default:
                    System.out.println("You entered an incorrect value, please enter one of the numbers below\n1\t2\t3");
                    continuation = false;
                    break;
            }
        }while (continuation==false);

    }


    public static void milk(String coffee){
        System.out.println("Would you like us to add milk to your " + coffee + "?\nYES & NO  : ");
        String milk = scanStr.nextLine();
        if (milk.equalsIgnoreCase("yes")) {
            System.out.println("Adding milk... ");

        } else if(milk.equalsIgnoreCase("no"))
            System.out.println("No milk added. ");
        else {
            System.out.println("You entered an incorrect value, please enter YES or NO :");
            milk(coffee);
        }
    }


    public static void sugar(String coffee){
        System.out.println("Would you like candy in your " + coffee + "?\nYES & NO  : ");
        String sugar = scanStr.nextLine();
        if (sugar.equalsIgnoreCase("yes")){
            System.out.println("How much sugar would you like?");
            int sugarAmount=scanInt.nextInt();
            System.out.println("Adding sugar...\n"+sugarAmount+" sugar added to your "+coffee+". Your "+coffee+" is ready.\n\n\t\tENJOY YOUR COFFEE :)");
        } else if (sugar.equalsIgnoreCase("no")) {
            System.out.println("No sugar added. \nYour "+coffee+" is ready.\n\t\tENJOY YOUR COFFEE :)");
        }
        else {
            System.out.println("You entered an incorrect value, please enter YES or NO :");
            sugar(coffee);
        }
    }

}
