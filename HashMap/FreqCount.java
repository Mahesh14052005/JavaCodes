import java.util.*;
public class FreqCount {
    public static void main(String[] args) {
        String input="java is easy";
        Map<Character,Integer> freq=new HashMap<>();
        input=input.replaceAll(" ", "");
        for(char chars:input.toCharArray()){
            freq.put(chars,freq.getOrDefault(chars, 0)+1);
            System.out.println(freq);
            
            
        }
        for(Map.Entry<Character,Integer> entry:freq.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
