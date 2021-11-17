package HW02;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int int1, int2;
        double double1, double2;

        Scanner input = new Scanner(System.in); //read keyboard input
        System.out.println("List of operations: add subtract multiply divide alphabetize");
        System.out.println("Enter an operation:");

        String operation = input.nextLine().trim().toLowerCase();

//        System.out.println("operation: " + operation);

        switch (operation) {
            case "add":
                //System.out.println("operation: " + operation);
                System.out.println("Enter two integers:");
                if (!input.hasNextInt()){
                    System.out.println("Invalid input entered. Terminating...");
                    break;                  
                }
                int1 = input.nextInt();
                if (!input.hasNextInt()){
                    System.out.println("Invalid input entered. Terminating...");
                    break;                  
                }
                int2 = input.nextInt();
                //System.out.println("int1: " + int1);
                //System.out.println("int2: " + int2);
                System.out.println("Answer: " + (int1 + int2) );
                break;
            case "subtract":
                //System.out.println("operation: " + operation);
                System.out.println("Enter two integers:");
                if (!input.hasNextInt()){
                    System.out.println("Invalid input entered. Terminating...");
                    break;                  
                }
                int1 = input.nextInt();
                if (!input.hasNextInt()){
                    System.out.println("Invalid input entered. Terminating...");
                    break;                  
                }
                int2 = input.nextInt();
                //System.out.println("int1: " + int1);
                //System.out.println("int2: " + int2);
                System.out.println("Answer: " + (int1 - int2) );
                break;
            case "multiply":
                //System.out.println("operation: " + operation);
                System.out.println("Enter two doubles:");
                double1 = input.nextDouble();
                double2 = input.nextDouble();
                //System.out.println("double1: " + double1);
                //System.out.println("double2: " + double2);
                System.out.printf("Answer: %.2f \n", (double1 * double2) );
                break;
            case "divide":
                //System.out.println("operation: " + operation);
                System.out.println("Enter two doubles:");
                double1 = input.nextDouble();
                double2 = input.nextDouble();
                //System.out.println("double1: " + double1);
                //System.out.println("double2: " + double2);
                if (double2 == 0){
                    System.out.println("Invalid input entered. Terminating...");
                    break;                  
                }
                System.out.printf("Answer: %.2f \n", (double1 / double2) );
                break;
            case "alphabetize":
                //System.out.println("operation: " + operation);
                System.out.println("Enter two words:");
                String word1 = input.next();
                String word2 = input.next();
                //System.out.println("word1: " + word1);
                //System.out.println("word2: " + word2);
                if (word1.compareToIgnoreCase(word2) < 0) {
                    System.out.println("Answer: " + word1 + " comes before " + word2 + " alphabetically.");
                }
                else if (word1.compareToIgnoreCase(word2) > 0) {
                    System.out.println("Answer: " + word2 + " comes before " + word1 + " alphabetically.");
                }
                else {
                    System.out.println("Answer: Chicken or Egg.");
                }
                break;
            default:
                System.out.println("Invalid input entered. Terminating...");
                break;
        }
    }
}
