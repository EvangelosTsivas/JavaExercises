package mypackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Excercise1 {

    public static void main(String[] args) {
        ArrayList<Bunny> hoppers = new ArrayList();

        hoppers.add(new Bunny(1));
        hoppers.add(new Bunny(2));
        hoppers.add(new Bunny(3));
        hoppers.add(new Bunny(4));
        hoppers.add(new Bunny(5));
        hoppers.get(0).hop();
        hoppers.get(1).hop();
        hoppers.get(2).hop();
        hoppers.get(3).hop();
        hoppers.get(4).hop();

        Iterator<Bunny> it = hoppers.iterator();
        while (it.hasNext()) {
            Bunny b = it.next();
            System.out.println(b);
        }

        Map<String, Integer> map = new HashMap();
        map.put("Bugs", hoppers.get(0).getBunnyNumber());
        map.put("Tom", hoppers.get(1).getBunnyNumber());
        map.put("Ann", hoppers.get(2).getBunnyNumber());
        map.put("Todd", hoppers.get(3).getBunnyNumber());
        map.put("Lola", hoppers.get(4).getBunnyNumber());
        
        Set<String> keysOfMap = map.keySet();
        Iterator<String> iter = keysOfMap.iterator();
        while (iter.hasNext()) {
            String name = iter.next();
            System.out.print(name +": ");
            hoppers.get(map.get(name)-1).hop();    
        }
        
 
        
    }

}
