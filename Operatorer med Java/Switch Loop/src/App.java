import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        boolean run = true;

        while (run) {
            System.out.println("Vad vill du jag ska göra?");
            System.out.println("a = Säg hej! b = Säg hejdå! c = Avsluta!");
            String choice = input.nextLine();

            switch (choice) {
                case "a":
                System.out.println("Hej!");
                break;

                case "b":
                System.out.println("Hejdå!");
                break;

                case "c":
                System.out.println("Avsluta");
                run=false;
                break;

                default:
                System.out.println("Skriv bara a, b eller c!");
                break;
            }
        }

        input.close();
    }
}
