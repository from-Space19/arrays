public class rainwaterTrap {
    public static void main(String args[]){

        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        if(height.length<=2){
            System.out.println(0);
            return;
        }
        int leftmax = height[0];
        int rightmax=height[height.length-1];
        int left = 1;int right = height.length-2;
        int sum =0;
        while(left<=right){
            if(leftmax<rightmax){
                if(height[left]>=leftmax){
                    leftmax = height[left];
                }else{
                    sum += leftmax-height[left];
                }
                left++;
            }else{
                if(height[right]>=rightmax){
                    rightmax = height[right];
                }else{
                    sum+= rightmax - height[right];
                }
                right--;
            }
        }
        System.out.println(sum);
    }
}
