import java.util.*;
public class ListOfAnagrams {
    
    public static List<List<String>> groupAnagrams(String[] words){
        Map<String,List<String>> map=new HashMap<>();
        for (String word : words){
            char[] chars=word.toCharArray();
            Arrays.sort(chars);
            String key=new String(chars);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(word);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        String[] input={"act","cat","dog","god","tac"};
        List<List<String>> result=groupAnagrams(input);
        for(List<String> group:result){
            System.out.println(group);
        }
    }

}
