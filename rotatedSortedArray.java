import java.util.*;

public class rotatedSortedArray {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of values in the array:");
        int size = input.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the value of the array:");
        for(int i = 0;i<size; i++){
            arr[i] = input.nextInt();
        }

        System.out.println("Enter the target:");
        int target = input.nextInt();

        int low = 0, high = size-1,mid;

        while(low<=high){
            mid = (high+low)/2;

            if(arr[mid]==target){
                System.out.println("The target is found at "+(mid+1)+" position.");
                return;
            }

            if(arr[low]<=arr[mid]){
                if(arr[low]<=target && arr[mid]>=target){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }else{
                if(arr[mid]<= target && arr[high]>=target){
                    low = mid+1;
                }
            }

        }
        System.out.println("-1");
    }
}
