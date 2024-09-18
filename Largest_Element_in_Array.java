import java.util.Scanner;

public class Largest_Element_in_Array {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = s.nextInt();        
        int [] array = new int[n];
        System.out.println("Enter elements of an array: ");
        for(int i = 0; i < n; i++){
            array[i] = s.nextInt();
        }            
        int max;
        max = array[0];
        for(int i = 1; i < n; i++){
            if(array[i] > max){
                max = array[i];
            }
        }               
        System.out.println(max);
    }
}