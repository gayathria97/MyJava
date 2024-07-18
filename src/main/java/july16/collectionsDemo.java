package july16;
import java.util.*;

public class collectionsDemo {
    public static void main(String[] args){

        Set<Integer> set=new HashSet<>();
        set.add(10);
        set.add(5);
        set.add(15);
        set.add(45);
        set.add(1);
        set.add(19);

        System.out.println("Set: "+set);

        List <Integer> list=List.of(50,30,75);
        System.out.println("List: "+list);
        TreeSet<Integer> treeSet = new TreeSet<>(list);
        System.out.println("treeSet: "+treeSet);
    }

}
