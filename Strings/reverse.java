

public class reverse {
    
    public static void main(String[] args){
        String s="madam";
        char[] chars=s.toCharArray();
        System.out.println(chars);
        int start=0, end=chars.length-1;
        while (start<end) {

            char temp=chars[start];
            chars[start]=chars[end];
            chars[end]=temp;
            start++;
            end--;
            
        }
        System.out.println("Reverse of a string is--->"+new String(chars));
        if(s.equals(new String(chars))){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
    }
}
