import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = input.nextInt();
        int array[] = new int [size];

        System.out.println("Enter the numbers:");
        for(int i = 0;i<size;i++){
            array[i] = input.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int curr = array[0];


        for(int i = 0; i<size;i++){
            for(int j = i+1; j<size; j++){
                curr = curr +array[j];
                if( curr>= max){
                    max = curr;
                }
            }
            if(i == size-1){
                return ;
            }
            curr = array[i+1];
            if( curr>= max){
                max = curr;
            }

        }
    }
}