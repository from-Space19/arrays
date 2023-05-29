import java.util.Scanner;
// this solution is wrong
public class givenSumPair {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = input.nextInt();
        int [] arr = new int [size];

        System.out.println("Enter the elements in the array: ");
        for(int i = 0; i<arr.length; i++){
            arr[i] = input.nextInt();
        }

        System.out.println("Enter the target : ");
        int target = input.nextInt();
        int pivot= findPivot(arr);
        int left = pivot; int right= pivot+1;
        if(left == right){
            System.out.println("false");
        }
        while(left != right){
            if((arr[left]+arr[right])==target){
                System.out.println("True");
                return;

            }

            if((arr[left]+arr[right])> target){
                left --;
            }else if ((arr[left]+arr[right]<target)){
                right++;
            }
        }


    }

    static int findPivot(int arr[]){
        int pivot=0;
        int left= 0; int right= arr.length-1;
        while(left != right){
            int mid = (left+right)/2;
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                pivot = mid;

            }else{
                if(arr[mid]<arr[left]){
                    right = mid-1;
                    pivot =right;
                }else{
                    left=mid+1;
                    pivot=left;
                }
            }
        }
        return pivot;

    }

}
