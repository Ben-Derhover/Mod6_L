import java.util.Scanner;

public class PartyAffiliation {


        public static void main(String[] args) {


                Scanner scanner = new Scanner(System.in);
                boolean done = false;

                String party = "";

                System.out.println("What is your party? D, R, I, or other");
                party = scanner.nextLine();


                if (party.equalsIgnoreCase("d")){
                        System.out.println("your symbol is a donkey ");
                }
                else if(party.equalsIgnoreCase("r")){
                        System.out.println("your symbol is a elephant");
                }
                else if (party.equalsIgnoreCase("I")){
                        System.out.println("your symbol is a person");
                }
                else{
                        System.out.println("your party is other");
                }

        }


}
