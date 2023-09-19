import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        App person = new App();
        Scanner input = new Scanner(System.in);

        System.out.println("Skriv ditt förnamn: ");
        String förnamn = input.next();

        System.out.println("Skriv ditt efternamn: ");
        String efternamn = input.next();


        person.förEfterNamn(förnamn, efternamn);

        input.close();
        
    }

    String aFörnamn, aEfternamn;

    public void förEfterNamn(String användarförnamn, String användarefternamn) {
        aFörnamn = användarförnamn;
        aEfternamn = användarefternamn;

        System.out.println("Ditt namn är " + aFörnamn + ", " + aFörnamn + " " + aEfternamn);
    }
}

