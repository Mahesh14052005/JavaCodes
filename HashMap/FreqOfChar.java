

import java.util.*;

public class FreqOfChar {
    public static void main(String[] args) {
        int[] arr={10,20,10,30,20,40};
        
        Map<Integer,Integer> fregMap=new HashMap<>();
        for(int c:arr){
            if(fregMap.containsKey(c)){
                fregMap.put(c,fregMap.get(c)+1);
            }
            else{
                fregMap.put(c,1);
            }
        }
        
        for(Map.Entry<Integer,Integer> entry:fregMap.entrySet()){
            System.out.println(entry.getKey()+"=>"+entry.getValue());
        }
    }
}
