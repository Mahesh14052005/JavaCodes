public class Rvs {

    public static Boolean ispalindrom(String a){
        Boolean Test=false;
        char[] chars=a.toCharArray();
        int start=0,end=a.length()-1;
        while(start<end){
            char temp=chars[start];
            chars[start]=chars[end];
            chars[end]=temp;
            start++;
            end--;
        }
        String rvs=new String(chars);
        if(rvs.equalsIgnoreCase(a)){
            Test=true;
            return Test;
        }
        else{
            return Test;
        }
    }
    public static void main(String[] args){
        String str="Madam";
        if(ispalindrom(str)){
            System.out.println(str+" is a palindrom");
        }
        else{
            System.out.println(str+" is not a palindrom");
        }
    }

}
