import java.util.Scanner;

public class Mod7 {
        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            String myLetter = "";
            double number =0;
            boolean done = false;

            do {
                System.out.println("enter a letter");
                if(in.hasNextDouble()){
                    number = in.nextDouble();
                    System.out.println("need a letter, you gave "+number);
                    in.nextLine();
                }
                else {
                    myLetter = in.nextLine();
                    if (myLetter. length() == 1){
                        done = true;
                    }
                    else{
                        System.out.println("need a single letter");
                    }
                }
            }while(!done);
            myLetter = myLetter. toLowerCase();
            switch(myLetter){
                case "a":
                case "e":
                case "o":
                case "u":
                case "y":
                    System.out.println(myLetter + " is a vowel");
                    break;
                default:
                    System.out.println(myLetter + "is a constant" );
                    System.out.println("TRY AGAIN");
                    break;
            }
        }
    }


