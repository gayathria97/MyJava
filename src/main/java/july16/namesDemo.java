package july16;

import java.util.*;

public class namesDemo {

    public static void main(String[] args){
        int n=5;
        String names[]={"john","remo","swathi","rana","raviteja"};
        Arrays.sort(names);
        System.out.println("names in order: ");
        for(int i=0;i<n;i++){
            System.out.println(names[i]);
        }
    }
}
