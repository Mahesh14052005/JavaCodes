import java.util.*;

public class FreqOfString{
    public static void main(String[] args) throws Exception{
        String input="java is easy and java is powerful";
        String[] words=input.split(" ");
        Map<String,Integer> freq=new HashMap<>();
        for(String word:words){
            if(freq.containsKey(word)){
                freq.put(word,freq.get(word)+1);
            }
            else{
                freq.put(word,1);
            }
        }
        
        for(Map.Entry<String,Integer> entry:freq.entrySet()){
            System.out.println(entry.getKey()+"=>"+entry.getValue());
        }
    }
}