import java.util.*;
public class subbarray {
    public static void main(String[] args) {
        int[] a={2,-1,3,-2,4};
        int csum=a[0];
        int maxi=a[0];
        System.out.println("Current sum so far = "+csum);
        System.out.println("Best sum so far = "+maxi);
        for(int i=1;i<a.length;i++){
            csum=Math.max(a[i],csum+a[i]);
            maxi=Math.max(maxi, csum);
            System.out.println("Current sum so far = "+csum);
            System.out.println("Best sum so far = "+maxi);
        }
        System.out.println("Maximum subarray sum is = "+maxi);
        
    }
}
