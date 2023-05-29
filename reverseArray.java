import java.util.*;

public class reverseArray {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int size = input.nextInt();
        String array[] = new String [size];
        System.out.println("Enter the values: ");

        for(int i = 0; i<size; i++){
            array[i] = input.next();
        }

        for(int i = 0; i<size;i++){
            System.out.print(array[i]+" ");

        }
        System.out.println();

        for( int i = size-1; i>=0;i--){
            System.out.print(array[i]+" ");
        }
    }
}
