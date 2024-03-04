import java.util.Scanner;

public class equal {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double input1 = 0;
        double input2 =0;
        boolean done = false;
        String trash = "";
        do {
            System.out.println("give me a number");
            if(in.hasNextDouble()){
                input1 = in.nextDouble();
                in.hasNextLine();
                System.out.println("give me a another number");
                if(in.hasNextDouble()){
                    input2 = in.nextDouble();
                    done = true;
                }
                else {
                    System.out.println("this input isnt aceppt");
                }
            }
            else {
                System.out.println("this input isnt aceppt");
            }

        }while(!done);

        if(input1 > input2){
            System.out.println("your first input is bigger");
        }
        else if (input2 > input1) {
            System.out.println("your second input is larger");
        }
        else {
            System.out.println("the numbers are the same");
        }

    }
}
