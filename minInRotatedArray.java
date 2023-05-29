import java.util.*;

public class minInRotatedArray {
    static int min(int arr[]){

        int low = 0;
        int high = arr.length-1;

        while(low<=high){
            int mid = (low+high)/2;
            if(mid>0&& arr[mid]< arr[mid-1]){
                return arr[mid];
            }

            if(arr[low] <= arr[mid] && arr[mid]>arr[high]){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }

        return arr[low];

    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = input.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the elements in the array:");
        for(int i = 0; i<size; i++){
            arr[i] = input.nextInt();
        }

        System.out.println(min(arr));
    }

}
