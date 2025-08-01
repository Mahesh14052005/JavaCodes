import java.lang.reflect.Array;
import java.util.Arrays;

public class angrams {

    public static Boolean isAngrams(String a,String b){
        a=a.replaceAll("//s",""). toLowerCase();
        b=b.replaceAll("//s",""). toLowerCase();
        if(a.length()!=b.length()){
            return false;
        }
        char[] ch1=a.toCharArray();
        char[] ch2=b.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1, ch2);

    }
    public static void main(String[] args) {
        String s1="Listen";
        String s2="Silent";
        if(isAngrams(s1,s2)){
            System.out.println(s1+" , "+s2+" are Anagrams");
        }
        else{
            System.out.println("Not Anagrams");
        }
    }
    
}
