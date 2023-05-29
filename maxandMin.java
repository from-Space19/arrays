import java.util.*;

public class maxandMin {


     static class Pair{
        int max;
        int min;
    }
    static Pair getminmax(int array[],int low, int high){
        Pair minmax = new Pair();
        Pair mimmaxleft = new Pair();
        Pair mimmaxright= new Pair();
        int mid;
        if(low == high){
            minmax.max = array[low];
            minmax.min = array[low];
            return minmax;
        }

        if(high == low+1){
            if(array[low]>=array[high]){
                minmax.max = array[low];
                minmax.min = array[high];
            }else{
                minmax.max = array[high];
                minmax.min = array[low];
            }
            return minmax;
        }

        mid = (low+high)/2;
        mimmaxright = getminmax(array,low,mid);
        mimmaxleft = getminmax(array,mid+1,high);

        if(mimmaxright.max>mimmaxleft.max){
            minmax.max = mimmaxright.max;
        }else{
            minmax.max = mimmaxleft.max;
        }

        if(mimmaxright.min<mimmaxleft.min){
            minmax.min = mimmaxright.min;
        }else{
            minmax.min = mimmaxleft.min;
        }

        return minmax;


    }












    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = input.nextInt();
        int array[] = new int[n];
        System.out.println("Enter the elements: ");

        for(int i =0; i<n; i++){
            array[i] = input.nextInt();
        }

        Pair minmax = getminmax(array,0,n-1);



        System.out.println("The Maximum number is "+minmax.max+" and the Minimum number is "+minmax.min);
    }
}
