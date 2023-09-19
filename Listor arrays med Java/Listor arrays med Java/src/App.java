import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
       // String[] veckansDagar = {"Måndag", "Tisdag", "Onsdag", "Torsdag", "Fredag", "Lördag", "Söndag"};

       // veckansDagar[2] = "Onsd";

       // System.out.println(veckansDagar[2]);

       List<String> zooAnimals = new ArrayList<>();

       zooAnimals.add("Hund");
       zooAnimals.add("Katt");
       zooAnimals.add("Gris");

        for (String animal : zooAnimals) {
            System.out.println(animal);
        }

        zooAnimals.add("Häst");
         for (String animal : zooAnimals) {
            System.out.println(animal);
        }
    }
}
