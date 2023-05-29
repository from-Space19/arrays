import java.util.*;

public class repeatAndMissing1 {

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of teh array: ");
        int size = input.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the numbers of the array:");
        for(int i = 0; i<size; i++){
            arr[i] = input.nextInt();
        }

        int least = 0;



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
        for(int i = 1; i<=size; i++){
            if(map.get(i)==null){
                missing = i;
            }
        }
        System.out.println("duplicate:"+duplicate);
        System.out.println("missing:"+missing);





    }


}
