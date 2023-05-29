import java.util.*;

public class pairWithSumInRotatedArray {
    public static void main(String args[]){
        int arr[] = {11,15,26,38,9,10};
        int x = 26;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i<arr.length; i++){
            map.put(arr[i],1);
        }
//        int mid = (arr.length-1)/2;
        for(int i = 0; i<arr.length; i++){
            int z = x-arr[i];
            if(z>=0){
                if(map.containsKey(z)){
                    System.out.println("true");
                    return;
                }
            }
        }

        System.out.println("false");
    }
}
