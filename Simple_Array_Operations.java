import java.util.Scanner;

public class Simple_Array_Operations {
    public static void main(String[] args) {
            
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = s.nextInt();    
        int [] array = new int[n];
        System.out.println("Enter elements of an array: ");
        for(int i = 0; i < n; i++){
            array[i] = s.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += array[i];
        }
        int avg = sum / n;   
        System.out.println(sum);
        System.out.println(avg);   
       
        int max, min;
        max = min = array[0];
        for(int i = 1; i < n; i++){
            if(array[i] > max){
                max = array[i];
            }
            else if(array[i] < min){
                min = array[i];
            }
        }        
        System.out.println(max);
        System.out.println(min);
    }
}