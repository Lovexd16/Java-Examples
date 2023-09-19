import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      //  System.out.print("Hello, World!");
      //  System.out.println("Rad 2!");
      //  System.out.print("hej hej");

        Scanner input = new Scanner(System.in);

        System.out.println("Skriv ett nummer");
        int nummer = input.nextInt();
        input.nextLine();
        System.out.println("Du skrev nummret: " + nummer);

        System.out.println("Skriv en text");
        String text = input.nextLine();
        System.out.println("Du skrev: " + text);

        input.close();
    }
}
