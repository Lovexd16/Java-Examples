import java.util.Scanner;

public class Tickets {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int ticketCost;
        ticketCost = 100;

        int movieNightCost = 2000;

        System.out.println("Hur många biljetter sålde ni?");
        int numberOfGuests;
        numberOfGuests = input.nextInt();

        int profit = ticketCost * numberOfGuests - movieNightCost;

        System.out.println("Ni har tjänat " + profit + " kr.");

    }
}
