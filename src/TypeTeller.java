import java.util.Scanner;

public class TypeTeller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inputD = 0;
        int inputI = 0;
        String inputS = "";
        boolean done = false;

        do {
            System.out.println("enter sum stuff");
            if (scanner.hasNextInt()){
                System.out.println("your input is a int");
                done = true;
            }
            else  if (scanner.hasNextDouble()){
                System.out.println("your input is a double");
                done = true;

            }
            else if (scanner.hasNext()){
                System.out.println("your input is a string");
                done = true;

            }

        }while(!done);
    }
}
