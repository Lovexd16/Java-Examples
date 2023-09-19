import java. util.Scanner;
import java. lang.Math;

public class App {
    public static void main(String[] args) throws Exception {
        
        int svar = (int) (Math.random() * 10) + 1;

        int försök = 0;

        boolean run = true;

        Scanner input = new Scanner(System.in);

        while (run) {

            System.out.println("Gissa på ett nummer mellan 1 och 10");

            System.out.println("Skriv din gissning: ");
            int gissning = input.nextInt();

            if (gissning == svar) {
                försök++;
                System.out.println("Du gissade rätt! Det tog dig " + försök + " försök");
                försök = 0;
                svar = (int) (Math.random() * 10) + 1;

            } 

            else if (gissning > svar && gissning > 0 && gissning < 11) {
                försök++;
                System.out.println("Talet är mindre än " + gissning + ", prova igen. Du har gissat " + försök + " gånger.");
            
            }

            else if (gissning < svar && gissning > 0 && gissning < 11) {
                försök++;
                System.out.println("Talet är större än " + gissning + ", prova igen. Du har gissat " + försök + " gånger.");
                
            }

            else {
                System.out.println("Du skrev inte ett tal mellan 1 och 10");
            } 

        }
        input.close();
    }
}
