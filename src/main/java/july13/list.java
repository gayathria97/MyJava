package july13;

import java.util.*;

public class list {
    
   public static void main(String[] args){
       Set<Integer>set = new HashSet<>();

       List<Integer>list= List.of(10,20,30,223,453,254,5423,34,23,54,32,54,43);
       set.addAll(list);
       System.out.println(set);
   }

}
