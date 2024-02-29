import java.util.Scanner;

public class BirthMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int monthInput = 0;
        boolean done = false;
        String trash = "";

        do {
            System.out.println("enter the number of your brith month");
            if(scanner.hasNextInt()){
                monthInput= scanner.nextInt();
                scanner.nextLine();
                if (monthInput >= 1 && monthInput <= 12){
                    done = true;
                }
                else{
                    System.out.println("number out of range");
                }
            }
            else {
                trash = scanner.nextLine();
                System.out.println("that is not a single number between 1-12");
            }

        }while(!done);
        System.out.println("your birth months is " + monthInput);
    }
}
