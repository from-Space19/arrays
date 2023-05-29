import java.util.Random;

public class kthLargestQuickSelect {
    public static int quickSelect(int arr[],int k){
        return kthLargest( arr,0,arr.length-1,arr.length-k);
    }
    public static int kthLargest(int arr[],int left,int right,int k){
        if(left==right){
            return left;
        }

        int indexJ = new Random().nextInt(right-left+1)+left;
        indexJ=partition(arr,left,right,indexJ);

        if(k==indexJ){
            return indexJ;
        }else if(k<indexJ){
            return kthLargest(arr,left,indexJ-1,k);
        }else{
            return kthLargest(arr,indexJ+1,right,k);
        }

//        return indexJ;
    }

    public static int partition(int arr[],int left, int right,int indexJ){
        int pivot = arr[indexJ];
        swap(arr,indexJ,right);
        indexJ = left;
        for(int i =left;i<=right;i++){
            if(arr[i]<=pivot){
                swap(arr,i,indexJ);
                indexJ++;
            }
        }
        return indexJ-1;
    }
    public static void swap(int arr[],int i,int indexJ){
        int temp;
        temp = arr[i];
        arr[i]= arr[indexJ];
        arr[indexJ]=temp;
    }




    public static void main(String args[]){
        int arr[]={7,10,4,3,20,15};
        int k = 4;
        int indexJ = quickSelect(arr,k);
        System.out.println(arr[indexJ]);

    }

}