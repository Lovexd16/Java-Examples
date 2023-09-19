import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Hur många sidor vill du att tärningarna ska ha?");
        int sidor = input.nextInt();

        System.out.println("Hur många tärningar vill du slå?");
        int antal = input.nextInt();

        System.out.println("Du har valt " + sidor + " sidor och " + antal + " tärningar");

        input.close();

        for(int i = 0; i < antal; i++) {
            Random random = new Random();
            int res = random.nextInt(sidor) +1;
            System.out.println("Kast " + (i + 1) + ": " + res);
        }


    }
}
