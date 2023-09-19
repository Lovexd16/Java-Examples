public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        System.out.println("Åtta gånger två är " + timesTwo(8));
        System.out.println("Tio gånger två är " + timesTwo(10));

    }

    public static int timesTwo(int number) {
        int sum = number * 2;
        return sum;
    }
}
