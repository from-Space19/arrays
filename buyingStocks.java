import java.util.*;


public class buyingStocks {


    public static void main(String args[]){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the number of days : ");
        int size= input.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the price of the stocks on different days: ");
        for(int i = 0; i<size; i++){
            arr[i] = input.nextInt();
        }

        int ptoday = 0;
        int least = Integer.MAX_VALUE;
        int profit = 0;

        for(int i = 0; i<size; i++){
            if(arr[i]<least){
                least = arr[i];
            }

            ptoday = arr[i] - least;
            if(ptoday>profit){
                profit = ptoday;
            }

        }
        if(profit>0){
            System.out.println("Max profit is:"+profit);

        }else{
            System.out.println(0);
        }


    }



}
