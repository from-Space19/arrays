import java.util.Scanner;

public class maximumSubArray {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = input.nextInt();
        int array[] = new int [size];

        System.out.println("Enter the numbers:");
        for(int i = 0;i<size;i++){
            array[i] = input.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int curr  ;

        for(int i = 0; i<size;i++){
            curr = 0;
            for(int j = i; j<size; j++){
                curr = curr +array[j];
                if( curr>= max){
                    max = curr;
                }
            }
        }
        System.out.println(max);
    }
}
