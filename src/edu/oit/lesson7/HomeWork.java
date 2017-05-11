package edu.oit.lesson7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HomeWork {
    
    public static Set<Integer> removeRange(Set<Integer> set, int min, int max) {
        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()) {
            int element = iterator.next();
            if(element<min || element>max) {
                iterator.remove();
            }
        }
        return set;
    }
    
    public static Map<String, String> teacher(Map<String, Integer> roster, Map<Integer, String> gradeMap) {
        Map<String, String> result = new HashMap<>();
        for(Entry<String, Integer> record: roster.entrySet()) {
            String grade = "";
            for(Entry<Integer, String> map: gradeMap.entrySet()) {
                if(record.getValue() < map.getKey()){
                    break;
                }
                grade = map.getValue();
            }
            result.put(record.getKey(), grade);
        }
        return result;
    }
    
    public static void main(String[] args) {

    }

}
