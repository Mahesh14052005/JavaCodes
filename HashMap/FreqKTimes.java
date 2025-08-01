
import java.util.*;
public class FreqKTimes {
    public static void main(String[] args) {
        int[] arr={1,7,4,3,4,8,7};
        Map<Integer,Integer> freq=new HashMap<>();
        int k=2;
        for(int nums:arr){
            freq.put(nums, freq.getOrDefault(nums,0)+1);
            
            if(freq.get(nums)==k){
                System.out.println(nums);
                return;
            }
        }
        System.out.println(-1);
    
    }
}
