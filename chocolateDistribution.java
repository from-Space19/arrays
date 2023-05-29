import java.util.*;

public class chocolateDistribution {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number  of the packets available:");
        int size = input.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the chocolates in each packet:");
        for(int i = 0; i<size; i++){
            arr[i ] = input.nextInt();
        }

        System.out.println("Enter the number of students:");
        int Stu = input.nextInt();
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        int array[] = new int[Stu];
        for(int i = 0; i<arr.length-Stu+1; i++){
            if((arr[i+Stu-1] - arr[i])<minDiff){
                minDiff = (arr[i+Stu-1] - arr[i]);
                for(int j = 0 ; j<Stu; j++){
                    array[j] = arr[i];
                }
            }
        }
        System.out.println("The minimum difference is :"+minDiff);
        for(int i = 0; i<Stu; i++){
            System.out.println("The "+(i+1)+" selected packet has "+arr[i]+" chocolates");
        }
    }
}
