import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        int poäng = 0;
        boolean run = true;
        String val;

        System.out.println("Om du når 5 poäng vinner du spelet!");

        while(run) {
            System.out.println("Du har " + poäng + " poäng. Skriv + för att lägga till eller - för att ta bort ett poäng.");
            val = input.nextLine();

            if (val.equals("+")) {
                poäng += 1;
            }

            else if (val.equals("-")) {
                poäng -= 1;
            }

            else {
                System.out.println("Du har inte valt ett giltigt alternativ!");
            }

            if (poäng == 5) {
                System.out.println("Du nådde " + poäng + " och därmed vann du spelet!");
                run = false;
            }

            else if (poäng < 0) {
                System.out.println("Du kan inte ha mindre än 0 poäng!");
                poäng = 0;
            }
        }
        input.close();
            
        }
            
    }
