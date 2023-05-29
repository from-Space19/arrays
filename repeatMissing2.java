import java.util.*;

public class repeatMissing2 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of teh array: ");
        int size = input.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the numbers of the array:");
        for(int i = 0; i<size; i++){
            arr[i] = input.nextInt();
        }

        int shouldbe = (size*(size+1))/2;
        int is = 0;
        for(int i= 0; i<size; i++){
            is += arr[i];
        }

        HashMap<Integer,Integer> map = new HashMap<>();
        int duplicate =0;

        for(int i = 0; i<size;i++){
            if(map.containsKey(arr[i])){
                duplicate = arr[i];
            }else{
                map.put(arr[i],1);
            }


        }
        int missing = 0;
        if(shouldbe-is>0){
            missing =shouldbe-is+duplicate;
        }else{
            missing = is-duplicate-shouldbe;
        }

        System.out.println(duplicate+"  "+missing);
    }
}
