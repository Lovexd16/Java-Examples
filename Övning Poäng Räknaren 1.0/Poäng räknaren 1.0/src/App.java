import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int poäng = 0;
        System.out.println("Poäng: " + poäng);

        System.out.println("Lägg till eller dra av poäng!");
        Scanner input = new Scanner(System.in);

        int poängLäggTill = input.nextInt();

        poäng += poängLäggTill;

        System.out.println("Du har " + poäng + " poäng");

        System.out.println("Lägg till eller dra av poäng!");
        poängLäggTill = input.nextInt();

        poäng += poängLäggTill;

        System.out.println("Du avslutade spelet med " + poäng + " poäng");

        input.close();


    }
}
