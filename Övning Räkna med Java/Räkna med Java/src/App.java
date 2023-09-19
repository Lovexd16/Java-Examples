import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);

        boolean run = true;

    while (run) {

        System.out.println("Skriv ett av följande räknesätt: multiplikation, division, addition, subtraktion eller avsluta genom att skriva: avsluta");
        String val = input.nextLine();

        if (!val.equals("multiplikation")&&!val.equals("division")&&!val.equals("addition")&&!val.equals("subtraktion")&&!val.equals("avsluta")) {
            System.out.println("Du har ej valt något av alternativen, försök igen");
            continue;
        }

        if (val.equals("avsluta")) {
            run = false;
            System.out.println("Programmet har avslutats!");
            break;
        }

        System.out.println("Skriv ett nummer");
        
        while (!scan.hasNextDouble()) {
            scan.next();

            System.out.println("Du skrev inte in ett tal, försök igen!");
        }

        scan.hasNextDouble();
        double nummer1 = scan.nextDouble();

        System.out.println("Skriv ett till nummer");

        while (!scan.hasNextDouble()) {
            scan.next();

            System.out.println("Du skrev inte in ett tal, försök igen!");
        }
       
        scan.hasNextDouble();
        double nummer2 = scan.nextDouble();

        double resultat = 0;

        switch (val) {
            case "multiplikation":
                resultat = nummer1 * nummer2;
                System.out.println(nummer1 + " multiplicerat med " + nummer2 + " är lika med " + resultat);
            break;

            case "division":
                resultat = nummer1 / nummer2;
                System.out.println(nummer1 + " dividerat med " + nummer2 + " är lika med " + resultat);
            break;

            case "addition":
                resultat = nummer1 + nummer2;
                System.out.println(nummer1 + " adderat med " + nummer2 + " är lika med " + resultat);
            break;

            case "subtraktion":
                resultat = nummer1 - nummer2;
                System.out.println(nummer1 + " subtraherat med " + nummer2 + " är lika med " + resultat);
            break;

            default:
                System.out.println("Du har gjort fel");
            break;
        }
    }

        input.close();
        scan.close();
       
    }
}
