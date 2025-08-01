public class Array {
    
    public static void main (String[] args){
        int[]  a={10,5,20,8};
        int max;
        max=a[0];
        for(int i=0;i<a.length;i++){
            
            if(a[i]>max){
                max=a[i];
            }
        }
        
        System.out.println("The max number is--->"+max);
        
    }

}
