public class SecLargest {

    public static void main(String[] args) {
        int[] a={10,5,20,35,8};
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int nums:a){
            if(nums>first){
                second=first;
                first=nums;
            }
            else if(nums>second && first!=nums){
                second=nums;
            }
            System.out.println("Second largest number is : "+second);

        }
    }
    
}
