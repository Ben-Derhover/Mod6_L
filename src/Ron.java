import java.util.Scanner;

public class Ron {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inputWidth = 0;
        double inputHeight = 0;
        double costBuilding = 0;
        double totalArea = 0;
        double totalPrice = 0;
        boolean done = false;

        do {
            System.out.println(" what is the width of the builing materials");
            if(scanner.hasNextDouble()){
                inputWidth = scanner.nextDouble();
                scanner.nextLine();
                System.out.println(" what is the Height of the builing materials");
                if(scanner.hasNextDouble()){
                    inputHeight = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println(" what is the cost of the builing materials");
                    if(scanner.hasNextDouble()){
                        costBuilding = scanner.nextDouble();
                        done = true;
                    }
                    else{
                        System.out.println("");
                    }
                }
            }
        }while(!done);

        totalArea = inputHeight * inputWidth;
        totalPrice = totalArea * costBuilding;
        System.out.println("your total price is " + totalPrice);





    }



    }
