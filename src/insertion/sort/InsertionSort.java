/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package insertion.sort;

import javax.swing.JOptionPane;
import java.util.ArrayList;
/**
 *
 * @author jacra1226
 */
public class InsertionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String Num = JOptionPane.showInputDialog("Input amount of numbers in the array."); 
       
        int Num1 = Integer.parseInt(Num);
        ArrayList<Integer> arrlist = new ArrayList<Integer>();
       int[] arrlist2;

    
        
        for(int i =0; i < Num1; i++){
            int r = (int) (Math.random() * 99);  
             arrlist.add(i,r);
             
        }
        int[] arr = new int[arrlist.size()];
for(int i = 0; i < arrlist.size(); i++) {
    arr[i] = arrlist.get(i);
}
      
       arrlist2 = doInsertionSort(arr);
        for(int i:arrlist2){
            System.out.print(i);
            System.out.print(", ");
        }
    }
     
    public static int[] doInsertionSort(int[] input){
         
        int temp;
        for (int i = 1; i < input.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(input[j] < input[j-1]){
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }
        return input;
    }
    
}
