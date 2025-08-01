package Solves;
import java.util.Scanner;
public class Palindram {

    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the name");
        String name=sc.nextLine();
        char[] chars=name.toCharArray();
        int start=0, end=chars.length-1;
        while (start<end){
            char temp=chars[start];
            chars[start]=chars[end];
            chars[end]=temp;
            start++;
            end--;
        }
        if(name.equals(new String(chars))){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
