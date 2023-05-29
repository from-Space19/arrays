import java.util.*;

public class nextPermutation {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = input.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the elements of the array:");
        for(int i = 0; i<size; i++){
            arr[i] = input.nextInt();
        }

        // for next permutation first we need to find the breaking point

        int index = -1;



        //i = size -2 because if the breaking point is at the last number then we can't replace it. and the outcome will be the same or the fist permutation.
        for(int i = size-2;i>=0;i--){
            if (arr[i] < arr[i+1]) {
                index = i;
                break;
            }
        }

        int array[] = new int[size];
        if(index==-1){
            int j = size;
            for(int i = 0;i<size;i++){
                array[i] = arr[j-1];
                j--;
            }
            for(int i = 0; i<arr.length; i++){
                System.out.print(array[i]+" ");
            }

        }


        if(index>=0){

            int temp = arr[index];
            for(int i = arr.length-1;i>index; i--){
                if(arr[index]<arr[i]){
                    arr[index]=arr[i];
                    arr[i]=temp;
                    break;
                }
                int j= index;
                array[i]=arr[j];
                size = size-1;
                j = j+1;
            }

            for(int i = 0; i<arr.length; i++){
                System.out.print(arr[i]+" ");
            }
        }



    }
}
