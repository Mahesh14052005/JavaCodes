
import java.util.HashMap;
import java.util.function.BiConsumer;
import java.util.*;
public class Transeversing {
    public static void main(String[] args){
        Map<String,Integer> marks=new HashMap<>();
        marks.put("Mahesh", 1);
        marks.put("Mahi", 2);
        marks.put("A", 3);
        marks.put("B", 4);
        for(Map.Entry<String,Integer> result:marks.entrySet()){
            System.out.println(result.getValue()+".Hi from "+result.getKey());   
        }
        for (String name:marks.keySet()){
            System.out.println(name+"=>"+marks.get(name));
        }/* 
        
        marks.forEach((name, mark) -> {
            System.out.println(name+"=>"+mark);
        });*/
    }
}
