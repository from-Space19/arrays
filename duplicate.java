import java.util.*;

public class duplicate {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = input.nextInt();
        int arr [] = new int[size];
        System.out.println("Enter the values in the array: ");
        for(int i = 0; i<size ; i++){
            arr[i]= input.nextInt();
        }

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                System.out.println("duplicate element is present at index "+i);
                return ;
            }else{
                map.put(arr[i],1);
            }
        }
       System.out.println("Duplicate element is not present.");

    }
}
