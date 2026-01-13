import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class NinjaManager {
    private List<NinjaRecord> ninjas = new LinkedList<>();

    public void addStart(NinjaRecord ninja){
        /*The option bellow could be user too
        ninjas.addFirst(ninja);*/
        ninjas.add(0, ninja);
    }
    public void addEnd(NinjaRecord ninja){
        ninjas.add(ninja);
    }
    public void removeFirst(NinjaRecord ninja){
        /*The option bellow could be user too
        ninjas.removeFirst(ninja);*/
        ninjas.remove(0);
    }

    public void showAll(){
        for (NinjaRecord ninja : ninjas){
            System.out.println(ninja.toString());
            System.out.println();
        };
    }

    //Criteria sorting
    public void sortByName(){
        ninjas.sort(Comparator.comparing(NinjaRecord::name));
    }
    public void sortByAge(){
        ninjas.sort(Comparator.comparing(NinjaRecord::age));
    }
    public void sortByVillage(){
        ninjas.sort(Comparator.comparing(NinjaRecord::village));
    }

    public NinjaRecord findByName(String name){
        for (NinjaRecord ninja : ninjas) {
            if (ninja.name().equalsIgnoreCase(name)){
                return ninja;
            }
        }
        return null;
    }

}
