import java.util.Scanner;

public class Bubble_Sort {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = s.nextInt();    
        int[] array = new int[n];
        System.out.println("Enter elements of an array: ");
        for(int i = 0; i < n; i++){
            array[i] = s.nextInt();
        }            
        for(int i = 0; i < n; i++){
            for (int j = 0; j < n-i-1; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }                
        }
        System.out.println("Sorted: ");
        for(int i = 0; i < n; i++){
            System.out.print(array[i]+" | ");
        }
    }    
}