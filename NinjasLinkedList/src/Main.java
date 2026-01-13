import java.util.Comparator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {


        NinjaManager manager = new NinjaManager();

        manager.addEnd(new NinjaRecord("Naruto Uzumaki", 16, Villages.Konohagakure));
        manager.addStart(new NinjaRecord("Sakura Haruno", 19, Villages.Konohagakure));
        manager.addStart(new NinjaRecord("Gaara", 15, Villages.Sunagakure));
        manager.addStart(new NinjaRecord("Zabuza Momochi", 26, Villages.Kirigakure));
        manager.addEnd(new NinjaRecord("Nagato", 35, Villages.Amegakure));
        manager.addStart(new NinjaRecord("Rock Lee", 16, Villages.Konohagakure));
        manager.addStart(new NinjaRecord("Deidara", 19, Villages.Iwagakure));

        manager.showAll();
    }
}
