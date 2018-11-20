/*
 * Jared Craig
 * 15/11/2018
 * Sorting program that uses insertion sort
 */

package insertion.sort;
import static java.lang.System.currentTimeMillis;
import javax.swing.JOptionPane;
import java.util.ArrayList;
/**
 *
 * @author jacra1226
 */
public class InsertionSort {
        static int comp = 0;
        static int swap = 0;
   
    public static void main(String[] args) {
       String Num = JOptionPane.showInputDialog("Input amount of numbers in the array."); 
        int Num1 = Integer.parseInt(Num);
        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        int[] arrlist2;
        double start=0;
        double finish=0;
        double total=0;

        //Creates a random arraylist
        for(int i =0; i < Num1; i++){
            int r = (int) (Math.random() * 100);  
             arrlist.add(i,r);
             
        }
        //Converts int arraylist to int array
        int[] arr = new int[arrlist.size()];
            for(int i = 0; i < arrlist.size(); i++) {
                 arr[i] = arrlist.get(i);
            }   
            
            // Starts timer
            start = currentTimeMillis();   
            arrlist2 = doInsertionSort(arr);
            finish = currentTimeMillis();
            total = finish - start;
            
        //Prints out sorted array    
        for(int i:arrlist2){
            System.out.print(i);
            System.out.print("\n"); 
        }
        
    //Prints out total time in ms, amount of comparisons and amount of swaps  
    System.out.println("the time taken is: " + total + "ms");
    System.out.println("Number of comparisons: " + comp);
    System.out.println("Number of swaps: " + swap);
    
    }
     
    public static int[] doInsertionSort(int[] input){
      
        int temp;
        for (int i = 1; i < input.length; i++) {
            for(int j = i ; j > 0 ; j--){
                comp++;
                if(input[j] < input[j-1]){ //Can switch A -> Z to Z -> A
                    swap++;
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }
        return input;
    }   
}
