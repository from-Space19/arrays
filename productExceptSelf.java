public class productExceptSelf {
    public static void main(String [] args){
        int nums[] = {1,2,3,4};
        int answer[] = new int [nums.length];
        int left = 1;
        for( int i = 0; i<nums.length; i++){
            if (i>0){
                left = left * nums[i-1];
            }
            answer[i] = left;
        }

        int right = 1;
        for(int i = nums.length-1;i>=0; i--){
            if(i<nums.length-1){
                right *= nums[i+1];
            }
            answer[i] *= right;
        }

        for(int i = 0; i<answer.length; i++){
            System.out.print(answer[i]+" ");
        }
    }
}
