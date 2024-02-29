import java.util.Scanner;
public class ShipCostCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double itemPrice = 0;
        double shippingCost = 1.02;
        double totalPrice = 0;
        String moreItems = "";
        String trash = "";
        boolean done = false;


        do{
            System.out.println("cost of the price");
            if(scanner.hasNextDouble()){
                itemPrice = scanner.nextDouble();
                scanner.nextLine();
                totalPrice = totalPrice + itemPrice;

                System.out.println("Any more items?");
                moreItems = scanner.nextLine();
                if(moreItems.equalsIgnoreCase("Y")){

                    System.out.println("Let's add some more items...");
                }
                else if (moreItems.equalsIgnoreCase("N")){
                    System.out.println("Done entering, your total is "+totalPrice);
                    done = true;
                }
                else{
                    System.out.println("Not a Y or N, looping");

                }

            }
        }while(!done);
        if(totalPrice >= 100){
            System.out.println("you cost is over $100 your shipping is free and your total cost is " +totalPrice);
        }
        else if (totalPrice <= 100) {
          totalPrice = shippingCost * totalPrice;
            System.out.println("your total is after shipping cost is " + totalPrice);
        }

    }
}