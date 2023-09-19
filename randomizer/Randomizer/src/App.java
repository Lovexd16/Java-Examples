import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Random random = new Random();
        int randNr = random.nextInt(6) + 1;

        System.out.println("Du slog en " + randNr);


    }
}
