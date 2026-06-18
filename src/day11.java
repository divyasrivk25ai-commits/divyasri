/*
import java.util.HashSet;

import java.util.Set;

public class day11 {
     public static void main(String[] args){
        Set<String>set=new HashSet<>();
        set.add("student 1");
        set.add("student 2");
        set.add("student 1");
        set.add("student 2");
        set.add("student 1");
        for(String s :set)
            System.out.println(s);
    }
}
 */
import java.util.HashMap;
import java.util.Map;

public class day11 {
    public static void main(String[] args) {
        Map<String, Object> person = new HashMap<>();
        person.put("ram", 89);
        person.put("jhon", 78);
        person.put("aravindh",67);
        person.put("percent", 90);

        System.out.println(person.get("ram"));
        person.entrySet().forEach(entry ->
            System.out.println(entry.getKey() + " : " + entry.getValue()));
        }
    }
