import java.util.Scanner;

public class Bondalizer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Skriv ditt förnamn");
        String förnamn = input.nextLine();

        System.out.println("Skriv ditt Efternamn");
        String efternamn = input.nextLine();

        System.out.println("Your namne is " + efternamn + ", " + förnamn + " " + efternamn + "!");


    }
}
