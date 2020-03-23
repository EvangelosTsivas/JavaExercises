
package exercise415;

import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;



public class Exercise415 {

  

    public static void main(String[] args) {
        
        TreeMap<Integer ,String> map = new TreeMap();
        //Random inputs to check methods!
        map.put(45,"John");
        map.put(65,"Mary");
        map.put(70,"Jack");
        map.put(10,"Tom");
        map.put(6,"Ann");
        
        printingMap(map);
        
        map.headMap(65, true);
        printingNavigableMap(map.headMap(65, true));
        
        map.subMap(10, 45);
        printingSortedMap(map.subMap(10, 70));
        
        TreeMap<Integer,String> mapclone =(TreeMap) map.clone();
        printingMap(mapclone);
        
        
    }

    
    public static void printingMap(TreeMap<Integer ,String> map){
        System.out.println("****Printing Map****");
        Set<Integer> keysOfMap = map.keySet();
        for (int  key : keysOfMap) {
            System.out.println(key + "--> " + map.get(key));
        }
    }
    
    
     public static void printingNavigableMap(NavigableMap<Integer ,String> map){
        System.out.println("****Printing Navigable  Map****");
        Set<Integer> keysOfMap = map.keySet();
        for (int  key : keysOfMap) {
            System.out.println(key + "--> " + map.get(key));
        }
    }
    
     public static void printingSortedMap(SortedMap<Integer ,String> map){
        System.out.println("****Printing Sorted Map****");
        Set<Integer> keysOfMap = map.keySet();
        for (int  key : keysOfMap) {
            System.out.println(key + "--> " + map.get(key));
        }
    }
     
     
     
}
